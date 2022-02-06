package com.noorteck.java.homework;

public class Day22Homework6 {

	public static void main(String[] args) {
		Day22Homework6 obj = new Day22Homework6();
		boolean resultOne = obj.endsWithNG("I like to Practice");
		boolean resultTwo = obj.endsWithNG("Everone is practicing");
		boolean resultThree = obj.endsWithNG("I am studying");
		boolean resultFour = obj.endsWithNG(null);
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);

	}

	public boolean endsWithNG(String strOne) {
		boolean result = false;

		
		if (strOne != null) {
			result=strOne.endsWith("ng");
			

		}
		return result;

	}
}

/**
 * 6. Write a method that takes a string parameter and return true if the string
 * parameter ends in "ng" Access Modifier: public Non-Access Modifier:
 * non-static Return Type: boolean Method Name: endsWithNG Parameter1: String
 * strOne Test Data: endsWithNG (null) ----- FALSE endsWithNG (“I like to
 * practice”) ----- FALSE endsWithNG (“Everyone is practicing”) ----- TRUE
 * endsWithNG (“I am studying”) ----- TRUE
 * 
 * 
 */