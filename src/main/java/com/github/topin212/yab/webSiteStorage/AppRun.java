package com.github.topin212.yab.webSiteStorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AppRun {

	public static void main(String[] args) {
		SpringApplication.run(AppRun.class, args);
	}

}