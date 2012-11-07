package main.java.nerv.bean;

import main.java.nerv.annotations.Domain;
import main.java.nerv.base.BaseBean;

@Domain(LoginBean.class)
public class LoginBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private String email;
	private String username;
	private String password;
	private String sex;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		
		return "username = "+username+"; password = "+password;
	}
	
	
}
