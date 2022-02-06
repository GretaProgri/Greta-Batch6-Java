package com.noorteck.java.day21;

public class Day21Homework18 {

	public static void main(String[] args) {

		Day21Homework18 obj = new Day21Homework18();
		String resultOne = obj.getNewStr("Welcome", "home");
		String resultTwo = obj.getNewStr("Java", "door");
		String resultThree = obj.getNewStr("Pro", "gress");
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

	}

	public String getNewStr(String strOne, String strTwo) {
		// String result="";

		if (strOne.length() == strTwo.length()) {
			return strOne + strTwo;
		}
		if (strOne.length() > strTwo.length()) {

			int difference = strOne.length() - strTwo.length();
			return strOne.substring(difference, strOne.length()) + strTwo;
		} else {
			int difference = strTwo.length() - strOne.length();
			return strOne + strTwo.substring(difference, strTwo.length());
		}
	}
}

/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 18. Write a method that takes two string parameters. The method append them
 * together and return the result. If the strings are different lengths, omit
 * chars from the beginning of longer string and make them equal length
 * 
 * Access Modifier: public Non-Access Modifier: non-static Return Type: String
 * Method Name: getNewStr Parameter1: String strOne Parameter2: String strTwo
 * Test Data: getNewStr (“Welcome”, “home”) ----- comehome getNewStr (“Java”,
 * “door”) ----- javadoor getNewStr (“cooking”, “pasta”) ----- okingpasta
 * getNewStr (“Pro”, “gress”) ----- Proess
 * 
 * 
 */
