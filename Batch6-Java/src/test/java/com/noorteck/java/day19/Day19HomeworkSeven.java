package com.noorteck.java.day19;

public class Day19HomeworkSeven {

	public static void main(String[] args) {
		Day19HomeworkSeven obj = new Day19HomeworkSeven();
		obj.helloTo(" Denis");
		obj.helloTo(" Malek");
		obj.helloTo(" Sara");

	}

	String helloTo(String strOne) {
		String result = "";

		System.out.println("Hello" + strOne);

		return result;

	}

}

/**
 * 
 * 7. Write a method that takes one String parameter (name) and the method
 * returns new String value appending “Hello” to name parameter
 * 
 * Access Modifier: default Non-Access Modifier: non-static Return Type: String
 * Method Name: helloTo Parameter1: String strOne Test Data: helloTo (“Denis”)
 * ----- Hello Denis helloTo (“Malek”) ----- Hello Malek helloTo (“Sara”) -----
 * Hello Sara
 * 
 * 
 */