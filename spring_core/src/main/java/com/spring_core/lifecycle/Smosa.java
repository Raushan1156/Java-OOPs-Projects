package com.spring_core.lifecycle;

public class Smosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price:");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Smosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Init by XML");
	}
	
	public void destroy() {
		System.out.println("Destroy by XML");
	}
}
