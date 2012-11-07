package main.java;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.framework.TestCase;
import org.easymock.MockControl;
import org.junit.Test;

public class validateTest extends TestCase{
	
	@Test
	public void testDoPost(){
		
		MockControl control = MockControl.createControl(HttpServletRequest.class);
		HttpServletRequest request = (HttpServletRequest) control.getMock();
		control = MockControl.createControl(HttpServletResponse.class);
		HttpServletResponse response = (HttpServletResponse) control.getMock();
		
		request.getParameter("name");		
		Validate validate = new Validate();
		try {
			validate.doGet(request, response);
		} catch (Exception e) {
			fail();
		}

		control.replay();
		assertEquals("chen",request.getParameter("name"));
        control.verify();
	}
}
