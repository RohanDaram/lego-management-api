package com.rohan.lego.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class LegoSet implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int setNumber;
	private int pieceCount;
	private LocalDate releaseDate;
	private LocalDate retirementDate;
	private int targetAge;
	private String theme;
	private float price;
	private SetClassification setClassification;
	private int numMinifigures;
	private boolean licensed;
	private SetDimensions dimensions;
	private SetInstructions instructions;
	private SetBuildDetails buildDetails;
	private List<SetMinifigures> minifigures;
	
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
	public SetClassification getSetClassification() {
		return setClassification;
	}
	public void setSetClassification(SetClassification setClassification) {
		this.setClassification = setClassification;
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
	public SetDimensions getDimensions() {
		return dimensions;
	}
	public void setDimensions(SetDimensions dimensions) {
		this.dimensions = dimensions;
	}
	public SetInstructions getInstructions() {
		return instructions;
	}
	public void setInstructions(SetInstructions instructions) {
		this.instructions = instructions;
	}
	public SetBuildDetails getBuildDetails() {
		return buildDetails;
	}
	public void setBuildDetails(SetBuildDetails buildDetails) {
		this.buildDetails = buildDetails;
	}
	public List<SetMinifigures> getMinifigures() {
		return minifigures;
	}
	public void setMinifigures(List<SetMinifigures> minifigures) {
		this.minifigures = minifigures;
	}
	@Override
	public String toString() {
		return "LegoSet [name=" + name + ", setNumber=" + setNumber + ", pieceCount=" + pieceCount + ", releaseDate="
				+ releaseDate + ", retirementDate=" + retirementDate + ", targetAge=" + targetAge + ", theme=" + theme
				+ ", price=" + price + ", setClassification=" + setClassification + ", numMinifigures=" + numMinifigures
				+ ", licensed=" + licensed + ", dimensions=" + dimensions + ", instructions=" + instructions
				+ ", buildDetails=" + buildDetails + ", minifigures=" + minifigures + "]";
	}
}
