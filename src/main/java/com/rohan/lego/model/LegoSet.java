package com.rohan.lego.model;

import java.io.Serializable;
import java.time.LocalDate;

public class LegoSet implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private int setNumber;
	private int pieceCount;
	private LocalDate releaseDate;
	private LocalDate retirementDate;
	private int targetAge;
	private String theme;
	private float price;
	private int numMinifigures;
	private boolean licensed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSetNumber() {
		return setNumber;
	}

	public void setSetNumber(int setNumber) {
		this.setNumber = setNumber;
	}

	public int getPieceCount() {
		return pieceCount;
	}

	public void setPieceCount(int pieceCount) {
		this.pieceCount = pieceCount;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public LocalDate getRetirementDate() {
		return retirementDate;
	}

	public void setRetirementDate(LocalDate retirementDate) {
		this.retirementDate = retirementDate;
	}

	public int getTargetAge() {
		return targetAge;
	}

	public void setTargetAge(int targetAge) {
		this.targetAge = targetAge;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNumMinifigures() {
		return numMinifigures;
	}

	public void setNumMinifigures(int numMinifigures) {
		this.numMinifigures = numMinifigures;
	}

	public boolean isLicensed() {
		return licensed;
	}

	public void setLicensed(boolean licensed) {
		this.licensed = licensed;
	}

	@Override
	public String toString() {
		return "LegoSet [name=" + name + ", setNumber=" + setNumber + ", pieceCount=" + pieceCount + ", releaseDate="
				+ releaseDate + ", retirementDate=" + retirementDate + ", targetAge=" + targetAge + ", theme=" + theme
				+ ", price=" + price + ", numMinifigures=" + numMinifigures + ", licensed=" + licensed + "]";
	}
}
