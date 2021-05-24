package com.manoelh.personapi.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DataBaseConfiguration {

	private String driverClassName;
	private String url;
	private String username;
	private String password;
	
	@Profile("dev")
	@Bean
	public String testDataBaseConnection() {
		System.out.println(driverClassName);
		System.out.println(username);
		System.out.println(password);
		return "Development Database Connected";
	}
	
	@Profile("prod")
	@Bean
	public String productionDataBaseConnection() {
		System.out.println(driverClassName);
		System.out.println(username);
		System.out.println(password);
		return "Production Database Connected";
	}
} 
