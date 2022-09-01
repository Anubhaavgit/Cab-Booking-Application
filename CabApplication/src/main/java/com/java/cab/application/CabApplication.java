package com.java.cab.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.cab.application.driver.Driver;

@SpringBootApplication
public class CabApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CabApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Driver driver = new Driver();
		driver.run();
	}
}
