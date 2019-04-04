package com.commonerror.commonerrorinspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SampleComponent {

	@Autowired
	@Qualifier("bmw")
	private Car car;

	public String getTopSpeed() {
		String gh = car.topSpeed();
		return gh;
	}

}
