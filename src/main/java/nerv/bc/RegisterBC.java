package main.java.nerv.bc;

import main.java.nerv.annotations.SQLTemplate;
import main.java.nerv.base.ResultBean;

public class RegisterBC {

	@SQLTemplate("insert into person values(?,?,?,?)")
	public ResultBean register(){
		return null;
	}
}
