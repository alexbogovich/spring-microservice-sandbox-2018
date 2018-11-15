package io.github.alexbogovich.querydslsandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class QuerydslSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuerydslSandboxApplication.class, args);
	}
}

