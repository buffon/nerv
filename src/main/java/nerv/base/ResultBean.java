package main.java.nerv.base;

import java.util.ArrayList;
import java.util.List;

public class ResultBean<T extends BaseBean> extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	private List<NervError> errors = new ArrayList<NervError>();
	private String status;
	private T bean;
	
	public List<NervError> getErrors() {
		return errors;
	}
	public void setErrors(List<NervError> errors) {
		this.errors = errors;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public T getBean() {
		return bean;
	}
	public void setBean(T bean) {
		this.bean = bean;
	}

}
