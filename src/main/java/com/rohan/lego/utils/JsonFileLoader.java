package com.rohan.lego.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rohan.lego.model.LegoSet;

@Component
public class JsonFileLoader {

	@Autowired
	private ObjectMapper objectMapper;

	public List<LegoSet> loadJsonDataFromFileUsingAutoConfiguredMapper() throws IOException {

		InputStream inputStream = JsonFileLoader.class.getClassLoader().getResourceAsStream("legosetdata.json");

		if (inputStream == null) {
			throw new IOException("Resource not found: " + "legosetdata.json");
		}

		return objectMapper.readValue(inputStream, new TypeReference<List<LegoSet>>() {
		});
	}
}
