package com.rohan.lego.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

//@Configuration
public class H2DatabaseCustomConfig {
	
	@Autowired
	H2DatabaseCustomConfigProperties h2DatabaseConfigProperties;
	
	@Bean
	public DataSource customH2dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(h2DatabaseConfigProperties.getUrl());
        hikariConfig.setUsername(h2DatabaseConfigProperties.getUsername());
        hikariConfig.setPassword(h2DatabaseConfigProperties.getPassword());
        hikariConfig.setDriverClassName(h2DatabaseConfigProperties.getDriverClassName());
        hikariConfig.setMaximumPoolSize(10);
        hikariConfig.setMinimumIdle(5);

        return new HikariDataSource(hikariConfig);
    }
}
