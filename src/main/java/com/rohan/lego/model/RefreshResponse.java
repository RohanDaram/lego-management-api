package com.rohan.lego.model;

import java.io.Serializable;

public class RefreshResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String source;
	private String message;
	private String code;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
