package com.noorteck.java.day22;

public class Day22Homework21 {
	public static void main(String[] args) {

		String resultOne = repeatChar("welcome");
		String resultTwo = repeatChar("Viorica");
		String resultThree= repeatChar("Abdul");
		String resultFour = repeatChar("Malek");


		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);

	}

	static String repeatChar(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			result += str.substring(i, i + 1) + str.substring(i, i + 1);

		}
		return result;
	}

}

/**
 * 21. Write a method that takes one string parameter. Method should repeat
 * every character twice in the original string and return the new value
 * 
 * Access Modifier: default Non-Access Modifier: static Return Type: String
 * Method Name: repeatChar Parameter1: String str Test Data: repeatChar
 * (“welcome”) ----- wweellccoommee repeatChar (“Viorica”) ----- VViioorriiccaa
 * repeatChar (“Abdul”) ----- AAbbdduull repeatChar (“Malek”) ----- MMaalleekk
 * 
 */