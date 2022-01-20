package com.noorteck.java.day19;

public class Day19HomeworkFour {
	public static void main(String[] args) {
		Day19HomeworkFour obj = new Day19HomeworkFour();
		obj.toLower("espn");
		obj.toLower("SOCCER");
		obj.toLower("STRING CLASS");

	}

	protected String toLower(String strOne) {

		System.out.println(strOne.toLowerCase());
		return strOne;

	}

}

/**
 * 
 * 5. Write a method that takes one String parameter and the method converts the
 * parameter to lowercase and return the new String value
 * 
 * Access Modifier: protected Non-Access Modifier: non-static Return Type:
 * String Method Name: toLower Parameter1: String strOne Test Data: toLower
 * (“espn”) ----- espn toLower (“SOCCER”) ----- soccer toLower (“STRING CLASS”)
 * ----- string class
 */