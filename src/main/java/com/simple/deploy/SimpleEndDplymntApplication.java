package com.simple.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SimpleEndDplymntApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleEndDplymntApplication.class, args);
		System.out.println("SwathiNarikadapa started the application");
	}

}
