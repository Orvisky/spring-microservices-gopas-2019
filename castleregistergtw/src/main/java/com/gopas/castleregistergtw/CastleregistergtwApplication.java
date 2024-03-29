package com.gopas.castleregistergtw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CastleregistergtwApplication {

	public static void main(String[] args) {
		SpringApplication.run(CastleregistergtwApplication.class, args);
	}

}
