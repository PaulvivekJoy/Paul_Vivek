package com.message.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.message.controller"} )
public class MessageRecorderApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(MessageRecorderApplication.class, args);
	}

}
