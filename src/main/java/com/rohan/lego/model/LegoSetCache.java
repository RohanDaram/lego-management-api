package com.rohan.lego.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("application")
public class LegoSetCache implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<LegoSet> legoSetData = new ArrayList<LegoSet>();

	public List<LegoSet> getLegoSetData() {
		
		return legoSetData;
	}

	public void setLegoSetData(List<LegoSet> legoSetData) {
		
		this.legoSetData = legoSetData;
	}
}
