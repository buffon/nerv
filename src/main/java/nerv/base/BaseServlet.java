package main.java.nerv.base;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.nerv.tools.ServletConfigManager;

public class BaseServlet extends HttpServlet {

	private static final long serialVersionUID = 5107642186270756640L;

	public static BaseRequest request = null;
	public static BaseResponse response = null;
	public final static String DOPOST = "doNERVPost";

	public static BaseRequest getRequest(HttpServletRequest req){

		ServletConfigManager.servletConfigParse(req);
		return new BaseRequest(req);
	}
	
	public static BaseResponse getResponse(HttpServletResponse res){
		return new BaseResponse(res);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		request = getRequest(req);
		response = getResponse(res);
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		request = getRequest(req);
		response = getResponse(resp);	
		Class<?> clazz = ServletConfigManager.servletMap.get(req.getParameter("servletname"));

		try {
			Class[] cargs = new Class[2];
			cargs[0] =BaseRequest.class;
			cargs[1] = BaseResponse.class;
			Method method = clazz.getMethod(DOPOST,cargs);
			method.invoke(clazz.newInstance(),request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void doNERVGet(BaseRequest request, BaseResponse response)
			throws ServletException, IOException{
		
	}

	public void doNERVPost(BaseRequest request, BaseResponse response)
			throws ServletException, IOException{
		
	}
}
