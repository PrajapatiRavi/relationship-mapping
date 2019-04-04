package com.commonerror.commonerrorinspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bmw")
public class BMW implements Car {

	@Override
	public String topSpeed() {

		return "100 km/hr";
	}

}
