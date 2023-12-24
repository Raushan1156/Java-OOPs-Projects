package com.spring_core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Location {

	private String place;

	
	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	@Override
	public String toString() {
		return "Location [place=" + place + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Post-construct init()");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Pre-Destroy end()");
	}

	
}
