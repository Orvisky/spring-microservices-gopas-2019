package com.gopas.serviceadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
@EnableAutoConfiguration
public class ServiceadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceadminApplication.class, args);
	}

}
