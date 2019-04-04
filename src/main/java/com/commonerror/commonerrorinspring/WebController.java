package com.commonerror.commonerrorinspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@Autowired
	private BasicConfiguration basicConfiguration;

	@GetMapping("/hello")
	public String hello() {
		return "Data: " + basicConfiguration.getMessage();

	}

}
