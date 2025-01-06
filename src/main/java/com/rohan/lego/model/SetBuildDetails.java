package com.rohan.lego.model;

import java.io.Serializable;

public class SetBuildDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private SetComplexityLevel complexityLevel;
	private float averageBuildTimeInHours ;
	
	public SetComplexityLevel getComplexityLevel() {
		return complexityLevel;
	}
	public void setComplexityLevel(SetComplexityLevel complexityLevel) {
		this.complexityLevel = complexityLevel;
	}
	public float getAverageBuildTimeInHours() {
		return averageBuildTimeInHours;
	}
	public void setAverageBuildTimeInHours(float averageBuildTimeInHours) {
		this.averageBuildTimeInHours = averageBuildTimeInHours;
	}
	
	@Override
	public String toString() {
		return "SetBuildDetails [complexityLevel=" + complexityLevel + ", averageBuildTimeInHours="
				+ averageBuildTimeInHours + "]";
	}
}