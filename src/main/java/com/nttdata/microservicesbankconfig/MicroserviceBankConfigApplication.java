package com.nttdata.microservicesbankconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroserviceBankConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBankConfigApplication.class, args);
	}

}
