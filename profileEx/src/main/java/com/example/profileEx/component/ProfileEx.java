package com.example.profileEx.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@PropertySource("application-prod.yml")// will not cause bean creation exception even prod spec key is not set to active
public class ProfileEx {

	
	@Value("${message}")
	String message;

	@Value("${prodmsg}")
	String prodMsg;
	
	@PostConstruct
	public void display() {
		System.out.println("Profile is set to : "+message);
		System.out.println("Profile is set to : "+prodMsg);
	}
}
