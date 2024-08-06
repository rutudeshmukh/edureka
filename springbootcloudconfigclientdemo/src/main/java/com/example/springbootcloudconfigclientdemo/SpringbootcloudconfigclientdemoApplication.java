package com.example.springbootcloudconfigclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootcloudconfigclientdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcloudconfigclientdemoApplication.class, args);
	}

}
