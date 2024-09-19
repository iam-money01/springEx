package com.example.profileEx.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Profile("prod")
public class ProdProfileMsg {
	
	@Autowired
	private Environment env;
	
	@Value("${message}")
	String message;

	@Value("${prodmsg}")
	String prodMsg;
	
	@PostConstruct
	public void display() {
		//System.out.println("Profile is set to : "+message);
		System.out.println(prodMsg);
		System.out.println("Env: "+env.getProperty("test"));
	}
}
