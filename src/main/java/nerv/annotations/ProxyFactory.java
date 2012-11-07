package main.java.nerv.annotations;

import java.lang.annotation.AnnotationFormatError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import main.java.nerv.base.BaseBean;

public abstract class ProxyFactory {
	
	@SuppressWarnings("unchecked")
	public static <T extends BaseBean> T newRoleDaoProxy(Class<T> bean) {

		Domain implAnnotation = bean.getAnnotation(Domain.class);

		if (implAnnotation == null)
			throw new AnnotationFormatError("该接口未定义实现类的注解");

		BaseBean implClass = null;
		try {
			implClass = implAnnotation.value().newInstance();
		} catch (Exception e) {
			throw new RuntimeException("该接口所定义的实现类不能被实例化", e);
		}

		return (T) Proxy.newProxyInstance(
				ProxyFactory.class.getClassLoader(),
				new Class<?>[] { bean },
				new RoleInvocationHandler(implClass)
		);
	}
	private static final class RoleInvocationHandler implements InvocationHandler {

		private BaseBean target;	

		public RoleInvocationHandler(BaseBean target) {
			this.target = target;
		}
		
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			return null;
		}

	}
}
