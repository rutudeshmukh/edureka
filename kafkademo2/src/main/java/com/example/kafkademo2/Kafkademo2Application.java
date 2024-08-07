package com.example.kafkademo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class Kafkademo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Kafkademo2Application.class, args);
	}

}
