package main.java.nerv.servlet;

import java.io.IOException;

import javax.servlet.ServletException;

import main.java.nerv.annotations.NervServ;
import main.java.nerv.base.BaseRequest;
import main.java.nerv.base.BaseResponse;
import main.java.nerv.base.BaseServlet;
import main.java.nerv.bean.LoginBean;

@NervServ("loginServlet")
public class LoginServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doNERVPost(BaseRequest request, BaseResponse response)
			throws ServletException, IOException {
		LoginBean loginBean = request.getObject(LoginBean.class, request);
		//forward
		request.putParams(request, "username", loginBean.getUsername());
		request.getRequestDispatcher("landingpage.jsp").forward(request, response);

	}
	

}
