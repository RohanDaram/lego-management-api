package com.rohan.lego.model;

import java.io.Serializable;

public class SetMinifigures implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private boolean exclusive;
	private boolean prints;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isExclusive() {
		return exclusive;
	}
	public void setExclusive(boolean exclusive) {
		this.exclusive = exclusive;
	}
	public boolean isPrints() {
		return prints;
	}
	public void setPrints(boolean prints) {
		this.prints = prints;
	}
	
	@Override
	public String toString() {
		return "SetMinifigures [name=" + name + ", exclusive=" + exclusive + ", prints=" + prints + "]";
	}
}
