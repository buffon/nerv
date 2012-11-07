package main.java.nerv.base;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class BaseResponse extends HttpServletResponseWrapper {

	public BaseResponse(HttpServletResponse response) {
		super(response);
	}

	public void putParams(String key,Object object){
		
	}
}
