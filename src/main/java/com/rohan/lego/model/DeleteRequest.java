package com.rohan.lego.model;

import java.io.Serializable;

public class DeleteRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String source;
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
}
