package com.commonerror.commonerrorinspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication

public class CommonErrorInSpringApplication implements CommandLineRunner {

	@Autowired
	private SampleComponent component;

	public static void main(String[] args) {
		SpringApplication.run(CommonErrorInSpringApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Helo" + component.getTopSpeed());

	}

}
