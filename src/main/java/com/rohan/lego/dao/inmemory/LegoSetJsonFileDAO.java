package com.rohan.lego.dao.inmemory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rohan.lego.dao.LegoSetOperations;
import com.rohan.lego.exception.DataAccessException;
import com.rohan.lego.model.LegoSet;
import com.rohan.lego.model.LegoSetCache;
import com.rohan.lego.model.UpdateRequest;
import com.rohan.lego.utils.JsonFileLoader;

@Repository
public class LegoSetJsonFileDAO implements LegoSetOperations {

	@Autowired
	private JsonFileLoader jsonFileLoader;

	@Autowired
	private LegoSetCache legoSetCache;

	@Override
	public List<LegoSet> getLegoSets() throws DataAccessException {

		return legoSetCache.getLegoSetData();
	}

	public List<LegoSet> refreshLegoSetData() throws DataAccessException {

		List<LegoSet> legoSets = null;

		try {
			legoSets = jsonFileLoader.loadJsonDataFromFileUsingAutoConfiguredMapper();
		} catch (IOException ex) {

			ex.printStackTrace();
			System.out.println("Exception from the DAO Layer :" + ex.getMessage());
			throw new DataAccessException("Error while fetching lego sets data", ex);
		}

		return legoSets;
	}

	@Override
	public boolean deleteLegoSetData() throws DataAccessException {

		legoSetCache.setLegoSetData(new ArrayList<LegoSet>());
		return true;
	}

	public boolean updateLegoSetData1(UpdateRequest request) throws DataAccessException {

		List<LegoSet> setsToUpdate = legoSetCache.getLegoSetData().stream()
				.filter(legoSet -> legoSet.getSetNumber() == request.getSetNumber()).collect(Collectors.toList());

		setsToUpdate.get(0).setPrice(request.getPrice());
		setsToUpdate.get(0).setRetirementDate(request.getRetirementDate());

		return true;
	}

	public boolean updateLegoSetData(UpdateRequest request) throws DataAccessException {

		legoSetCache.getLegoSetData().stream().filter(legoSet -> legoSet.getSetNumber() == request.getSetNumber())
				.forEach(lego -> {
					lego.setPrice(request.getPrice());
					lego.setRetirementDate(request.getRetirementDate());
				});
		return true;
	}

}
