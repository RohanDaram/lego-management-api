package com.rohan.lego.model;

import java.io.Serializable;

public class SetDimensions implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private float length;
	private float width;
	private float weight;
	private SetDimensionUnits dimensionUnits;
	private SetWeightUnits weightUnits;
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public SetDimensionUnits getDimensionUnits() {
		return dimensionUnits;
	}
	public void setDimensionUnits(SetDimensionUnits dimensionUnits) {
		this.dimensionUnits = dimensionUnits;
	}
	public SetWeightUnits getWeightUnits() {
		return weightUnits;
	}
	public void setWeightUnits(SetWeightUnits weightUnits) {
		this.weightUnits = weightUnits;
	}
	
	@Override
	public String toString() {
		return "SetDimensions [length=" + length + ", width=" + width + ", weight=" + weight + ", dimensionUnits="
				+ dimensionUnits + ", weightUnits=" + weightUnits + "]";
	}
}
