package main.java.nerv.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import main.java.nerv.base.BaseBean;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Domain {

	Class<? extends BaseBean> value();
}
