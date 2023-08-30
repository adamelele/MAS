package com.example.Proojekt_MAS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages="entity")
public class ProojektMasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProojektMasApplication.class, args);


	}

}
