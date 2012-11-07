package main.java;

import javax.servlet.http.HttpServletRequest;
import org.easymock.*;
import junit.framework.TestCase;

public class MockRequestTest extends TestCase{
	
private MockControl control;
private HttpServletRequest mockRequest;

public void testMockRequest(){
//创建一个Mock HttpServletRequest的MockControl对象
control = MockControl.createControl(HttpServletRequest.class);

//获取一个Mock HttpServletRequest对象
mockRequest = (HttpServletRequest) control.getMock();

//设置期望调用的Mock HttpServletRequest对象的方法
mockRequest.getParameter("name");

//设置调用方法的返回值，并指定调用次数
//以下后两个参数表示最少调用一次，最多调用一次
control.setReturnValue("chen" ,1 ,1);

//expect(mockRequest.getParameter("username")).andReturn("admin");

//设置Mock HttpServletRequest的状态，
//表示此Mock HttpServletRequest对象可以被使用
control.replay();

//使用断言检查调用
assertEquals("chen",mockRequest.getParameter("name"));
mockRequest.getAuthType();

//验证期望的调用
control.verify();
}
}