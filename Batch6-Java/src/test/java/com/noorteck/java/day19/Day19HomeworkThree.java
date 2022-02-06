package com.noorteck.java.day19;

public class Day19HomeworkThree {

	public static void main(String[] args) {
		Day19HomeworkThree obj = new Day19HomeworkThree();
		String resultOne = obj.toUpper("Pro");
		String resultTwo = obj.toUpper("java");
		String resultThree = obj.toUpper(null);
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

	}

	private String toUpper(String strOne) {
		String result = "";
		if (null == strOne) {
			result = null;
		} else {

			result = strOne.toUpperCase();

		}
		return result;
	}

}

/**
 * 
 * 
 * Write a method that takes one String parameter and the method converts the
 * parameter to uppercase and return the new String value
 * 
 * Access Modifier: default Non-Access Modifier: non-static Return Type: String
 * Method Name: toUpper Parameter1: String strOne Test Data: toUpper (“Pro”)
 * ----- PRO toUpper (“java”) ----- LEARNING toUpper (“java training”) -----
 * JAVA TRAINING
 * 
 * ----------------------------------------------------------------------------------------------------------------
 * 
 */