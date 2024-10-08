package com.example.profileEx.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@PropertySource("application-qa.yml")
@PropertySource("application-dev.yml")// will not cause bean creation exception even QA spec key is not set to active
public class ProfileEx {

	
	@Value("${message}")
	String message;

	@Value("${qamsg}")
	String qaMsg;
	
	@PostConstruct
	public void display() {
		System.out.println("Profile is set to : "+message);
		System.out.println("Profile is set to : "+qaMsg);
	}
}
