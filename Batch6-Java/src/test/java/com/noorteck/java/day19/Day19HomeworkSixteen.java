package com.noorteck.java.day19;

public class Day19HomeworkSixteen {

	public static void main(String[] args) {
		Day19HomeworkSixteen obj = new Day19HomeworkSixteen();
		String resultOne = obj.concatString("Java", "awesome");
		String resultTwo = obj.concatString("food", "door");

		String resultThree = obj.concatString("java", "training");
		String resultFour = obj.concatString("Pro", "ogress");
		System.out.println(resultOne.substring(0, 4)+ resultOne.substring(5,11));
		System.out.println(resultTwo.substring(0, 4) + resultTwo.substring(6, 8));
		System.out.println(resultThree);
		System.out.println(resultFour.substring(0, 3) + resultFour.substring(4, 9));

	}

	String concatString(String strOne, String strTwo) {

		String result = strOne.concat(strTwo);

		return result;
	}

}

/**
 * 16. Write a method to concatenate two given strings such that, if the
 * concatenation creates a double characters then removes one of the characters.
 * a. For example strOne = “food”; strTwo =”door”. After concatenating two
 * strings it will give us “fooddoor”(dd is double character, remove one of the
 * d) then the string after concatenation are: “foodoor”
 * 
 * Access Modifier: default Non-Access Modifier: non-static Return Type: String
 * Method Name: concatString Parameter1: String strOne Parameter2: String strTwo
 * Test Data: concatString (“Java”, “awesome”) ----- javawesome concatString
 * (“food”, “door”) ----- foodoor concatString (“java”, “training”) -----
 * javatraining concatString (“Pro”, “ogress”) ----- Progress
 * 
 * 
 * 
 */