package com.rohan.lego.dao;

import java.util.List;

import com.rohan.lego.exception.DataAccessException;
import com.rohan.lego.model.LegoSet;
import com.rohan.lego.model.UpdateRequest;

public interface LegoSetOperations {
	
	public List<LegoSet> getLegoSets() throws DataAccessException;
	
	public List<LegoSet> refreshLegoSetData() throws DataAccessException;
	
	public boolean deleteLegoSetData() throws DataAccessException;
	
	public boolean updateLegoSetData(UpdateRequest request) throws DataAccessException;
}
