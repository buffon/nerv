package main.java.nerv.servlet;

import java.io.IOException;

import javax.servlet.ServletException;

import main.java.nerv.annotations.SQLTemplate;
import main.java.nerv.base.BaseRequest;
import main.java.nerv.base.BaseResponse;
import main.java.nerv.base.BaseServlet;
import main.java.nerv.bean.LoginBean;

public class RegisterServlet extends BaseServlet{

	private static final long serialVersionUID = 1L;

	
	public void doNERVPost(BaseRequest request, BaseResponse response)
			throws ServletException, IOException {
		LoginBean loginBean = request.getObject(LoginBean.class, request);
		//List<>

	}
}
