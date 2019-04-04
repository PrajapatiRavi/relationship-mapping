package com.commonerror.commonerrorinspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AUDI implements Car {

	@Override
	public String topSpeed() {

		return "80 km/hr";
	}

}
