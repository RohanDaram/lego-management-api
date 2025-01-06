package com.rohan.lego.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.rohan.lego.model.LegoSet;
import com.rohan.lego.model.LegoSetCache;
import com.rohan.lego.utils.JsonFileLoader;

//@Configuration
public class ApplicationStartupConfig {
	
	@Autowired
	JsonFileLoader jsonFileLoader;
	
	@Autowired
	private LegoSetCache legoSetCache;
	
	
	@Bean
	@Scope(BeanDefinition.SCOPE_SINGLETON)
	public CommandLineRunner applicationStartup() throws Exception {
		
		return (String... args) -> {			
			List<LegoSet> legoSetData = jsonFileLoader.loadJsonDataFromFileUsingAutoConfiguredMapper();		
			legoSetCache.setLegoSetData(legoSetData);
			System.out.println(legoSetData.size());
		};
	}
}
