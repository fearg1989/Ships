package com.ships.Ships;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ShipsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShipsApplication.class, args);
	}

}
