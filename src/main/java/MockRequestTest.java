package main.java;

import javax.servlet.http.HttpServletRequest;
import org.easymock.*;
import junit.framework.TestCase;

public class MockRequestTest extends TestCase{
	
private MockControl control;
private HttpServletRequest mockRequest;

public void testMockRequest(){
//����һ��Mock HttpServletRequest��MockControl����
control = MockControl.createControl(HttpServletRequest.class);

//��ȡһ��Mock HttpServletRequest����
mockRequest = (HttpServletRequest) control.getMock();

//�����������õ�Mock HttpServletRequest����ķ���
mockRequest.getParameter("name");

//���õ��÷����ķ���ֵ����ָ�����ô���
//���º�����������ʾ���ٵ���һ�Σ�������һ��
control.setReturnValue("chen" ,1 ,1);

//expect(mockRequest.getParameter("username")).andReturn("admin");

//����Mock HttpServletRequest��״̬��
//��ʾ��Mock HttpServletRequest������Ա�ʹ��
control.replay();

//ʹ�ö��Լ�����
assertEquals("chen",mockRequest.getParameter("name"));
mockRequest.getAuthType();

//��֤�����ĵ���
control.verify();
}
}