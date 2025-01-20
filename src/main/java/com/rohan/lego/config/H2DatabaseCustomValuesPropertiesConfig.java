package com.rohan.lego.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class H2DatabaseCustomValuesPropertiesConfig {

	@Autowired
	H2DatabaseCustomValueProperties props;
	
	@Bean
	public DataSource customH2dataSource() {
		System.out.println(" Custom DataSource properties :"+this);
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(props.getUrl());
        hikariConfig.setUsername(props.getUser());
        hikariConfig.setPassword(props.getPassword());
        hikariConfig.setDriverClassName(props.getDriverClassName());
        hikariConfig.setMaximumPoolSize(10);
        hikariConfig.setMinimumIdle(5);

        return new HikariDataSource(hikariConfig);
    }	
}
