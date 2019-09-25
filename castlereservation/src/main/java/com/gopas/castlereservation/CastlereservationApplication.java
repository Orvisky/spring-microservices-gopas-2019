package com.gopas.castlereservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CastlereservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CastlereservationApplication.class, args);
	}

}
