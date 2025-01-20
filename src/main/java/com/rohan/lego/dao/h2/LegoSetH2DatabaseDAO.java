package com.rohan.lego.dao.h2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rohan.lego.dao.LegoSetOperations;
import com.rohan.lego.exception.DataAccessException;
import com.rohan.lego.model.LegoSet;
import com.rohan.lego.model.UpdateRequest;

@Component
public class LegoSetH2DatabaseDAO implements LegoSetOperations {

	@Autowired
	DataSource h2DataSource;

	@Override
	public List<LegoSet> getLegoSets() throws DataAccessException {

		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		List<LegoSet> legoSets = new ArrayList<LegoSet>();
		try {
			conn = h2DataSource.getConnection();
			statement = conn.createStatement();
			rs = statement.executeQuery("SELECT * FROM LEGO_SET");

			while (rs.next()) {
				String name = rs.getString("NAME");
				int setNumber = rs.getInt("SET_NUMBER");
				int pieceCount = rs.getInt("PIECE_COUNT");
				Date releaseDate = rs.getDate("RELEASE_DATE");
				System.out.println(releaseDate);
				Date retirementDate = rs.getDate("RETIREMENT_DATE");
				int targetAge = rs.getInt("TARGET_AGE");
				String theme = rs.getString("THEME");
				float price = rs.getFloat("PRICE");
				int numMinifigures = rs.getInt("NUM_MINIFIGURES");
				boolean licensed = rs.getBoolean("LICENSED");

				LegoSet legoSet = new LegoSet();
				legoSet.setName(name);
				legoSet.setSetNumber(setNumber);
				legoSet.setPieceCount(pieceCount);
				legoSet.setReleaseDate(releaseDate.toLocalDate());
				legoSet.setRetirementDate(retirementDate.toLocalDate());
				legoSet.setTargetAge(targetAge);
				legoSet.setTheme(theme);
				legoSet.setPrice(price);
				legoSet.setNumMinifigures(numMinifigures);
				legoSet.setLicensed(licensed);
				legoSets.add(legoSet);
			}

		} catch (SQLException e) {
			throw new DataAccessException(
					"LegoSetH2DatabaseDAO : Unable to execute the statment to get the legosets from the H2 database");
		} finally {
			try {
				rs.close();
				statement.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("LegoSetH2DatabaseDAO : Error while closing the DB connection objects");
			}

		}

		return legoSets;
	}

	@Override
	public List<LegoSet> refreshLegoSetData() throws DataAccessException {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean deleteLegoSetData() throws DataAccessException {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean updateLegoSetData(UpdateRequest request) throws DataAccessException {
		throw new UnsupportedOperationException();
	}
}
