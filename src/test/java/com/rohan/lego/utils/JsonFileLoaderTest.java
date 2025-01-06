package com.rohan.lego.utils;

import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.rohan.lego.model.LegoSet;

@SpringBootTest
public class JsonFileLoaderTest {

	@Autowired
	private JsonFileLoader jsonFileLoader;

	@Test
	public void loadJsonDataFromFileUsingCustomMapperTest() throws IOException {

		assert (jsonFileLoader.loadJsonDataFromFileUsingCustomMapper() != null);

		List<LegoSet> legoSets = jsonFileLoader.loadJsonDataFromFileUsingCustomMapper();

		legoSets.stream().forEach(System.out::println);
	}

	@Test
	public void loadJsonDataFromFileUsingAutoConfiguredMapperTest() throws IOException {

		assert (jsonFileLoader.loadJsonDataFromFileUsingAutoConfiguredMapper() != null);

		List<LegoSet> legoSets = jsonFileLoader.loadJsonDataFromFileUsingAutoConfiguredMapper();
		
		legoSets.stream().forEach(System.out::println);
	}
}