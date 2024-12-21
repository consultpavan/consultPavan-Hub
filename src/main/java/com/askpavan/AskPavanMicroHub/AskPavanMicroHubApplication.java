package com.askpavan.AskPavanMicroHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AskPavanMicroHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(AskPavanMicroHubApplication.class, args);
	}

}
