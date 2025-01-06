package com.rohan.lego.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohan.lego.dao.LegoSetOperations;
import com.rohan.lego.exception.DataAccessException;
import com.rohan.lego.model.DeleteRequest;
import com.rohan.lego.model.LegoSet;
import com.rohan.lego.model.LegoSetCache;
import com.rohan.lego.model.RefreshRequest;
import com.rohan.lego.model.UpdateRequest;

@Service
public class LegoSetService {

	@Autowired
	LegoSetOperations legoSetJsonFileDAO;

	@Autowired
	LegoSetCache legoSetCache;

	public List<LegoSet> getLegoSets() {

		List<LegoSet> legoSets = new ArrayList<>();

		try {
			legoSets = legoSetJsonFileDAO.getLegoSets();
		} catch (DataAccessException daex) {
			daex.printStackTrace();
			System.out.println("Exception from the DAO Layer :" + daex.getMessage());

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Unknown Exception in the DAO Layer :" + ex.getMessage());

		}
		return legoSets;
	}

	public List<LegoSet> getLegoSetsByTheme(String legoTheme) {

		return getLegoSets().stream().filter(legoSet -> legoSet.getTheme().trim().equalsIgnoreCase(legoTheme))
				.collect(Collectors.toList());
	}

	public boolean reloadData(RefreshRequest request) {

		try {

			List<LegoSet> legoSets = legoSetJsonFileDAO.refreshLegoSetData();
			legoSetCache.setLegoSetData(legoSets);
		} catch (DataAccessException daex) {

			return false;
		}

		return true;
	}

	public boolean deleteLegoSetData(DeleteRequest request) {

		try {

			return legoSetJsonFileDAO.deleteLegoSetData();
		} catch (DataAccessException daex) {

			return false;
		}
	}

	public boolean updateLegoSetData(UpdateRequest request) {

		try {

			return legoSetJsonFileDAO.updateLegoSetData(request);
		} catch (DataAccessException daex) {

			return false;
		}
	}
}
