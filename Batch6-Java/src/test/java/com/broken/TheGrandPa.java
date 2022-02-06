package com.broken;

public class TheGrandPa {
	protected String country;
	private String city;
	
	
	
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getCity() {
		return city;
	}
 
 
	public  void display() {
		
		System.out.println("Country: " + country);
		System.out.println("City: " + city);
		addNum(11,4);
	}
	
	private double addNum(int a, int b) {
		
		double result;
		
		result = a+b;
		
		return result;
	}
	
}


