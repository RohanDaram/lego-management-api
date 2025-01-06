package com.rohan.lego.model;

import java.io.Serializable;

public class SetInstructions implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int numPages;
	private int numInstructions;
	private boolean digital;
	
	public int getNumPages() {
		return numPages;
	}
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	public int getNumInstructions() {
		return numInstructions;
	}
	public void setNumInstructions(int numInstructions) {
		this.numInstructions = numInstructions;
	}
	public boolean isDigital() {
		return digital;
	}
	public void setDigital(boolean digital) {
		this.digital = digital;
	}
	
	@Override
	public String toString() {
		return "SetInstructions [numPages=" + numPages + ", numInstructions=" + numInstructions + ", digital=" + digital
				+ "]";
	}	
}
