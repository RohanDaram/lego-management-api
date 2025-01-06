package com.rohan.lego.model;

import java.io.Serializable;
import java.time.LocalDate;

public class UpdateRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String source;
	private int setNumber;
	private LocalDate retirementDate;
	private float price;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getSetNumber() {
		return setNumber;
	}
	public void setSetNumber(int setNumber) {
		this.setNumber = setNumber;
	}
	public LocalDate getRetirementDate() {
		return retirementDate;
	}
	public void setRetirementDate(LocalDate retirementDate) {
		this.retirementDate = retirementDate;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
