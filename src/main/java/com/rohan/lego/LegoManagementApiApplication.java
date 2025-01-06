package com.rohan.lego;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rohan.lego.model.LegoSet;
import com.rohan.lego.model.LegoSetCache;
import com.rohan.lego.utils.JsonFileLoader;

@SpringBootApplication
public class LegoManagementApiApplication implements CommandLineRunner {

	
	@Autowired
	JsonFileLoader jsonFileLoader;
	
	@Autowired
	private LegoSetCache legoSetCache;

	public static void main(String[] args) {
		SpringApplication.run(LegoManagementApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<LegoSet> legoSetData = jsonFileLoader.loadJsonDataFromFileUsingAutoConfiguredMapper();
		
		legoSetCache.setLegoSetData(legoSetData);
		System.out.println("# of Lego Sets loaded from file into Cache : " +  legoSetData.size());
	}
}
