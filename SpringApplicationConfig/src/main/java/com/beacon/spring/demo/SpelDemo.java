package com.beacon.spring.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spel")
public class SpelDemo {
	
	@Value("#{19 + 1 }")
	private double add;
	
	@Value("#{'String1' +'String2'}")
	private String addString;

	public double getAdd() {
		return add;
	}

	public void setAdd(double add) {
		this.add = add;
	}

	public String getAddString() {
		return addString;
	}

	public void setAddString(String addString) {
		this.addString = addString;
	}

	@Override
	public String toString() {
		return "SpelDemo [add=" + add + ", addString=" + addString + "]";
	}

}
