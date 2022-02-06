package com.noorteck.java.homework;

public class Da22Homework5 {

	public static void main(String[] args) {
		String resultOne = removeSpace(" Java Training");
		String resultTwo = removeSpace(" I like to practice");
		String resultThree = removeSpace(null);
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

	}

	public static String removeSpace(String strOne) {
		String result = null;

		if (strOne != null) {
			result= (strOne.trim());

		}
		return result;
	}

}

/**
 * 
 * 5. Write a method to trim any leading or trailing whitespace from a given
 * string Access Modifier: public Non-Access Modifier: static Return Type:
 * String Method Name: removeSpace Parameter1: String strOne Test Data:
 * removeSpace (null”) ----- null removeSpace (“ Java Training ”) ----- java
 * Training removeSpace (“ I like to practice ”) ----- I like to practice
 * 
 * 
 */