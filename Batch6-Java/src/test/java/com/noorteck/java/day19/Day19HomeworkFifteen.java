package com.noorteck.java.day19;

public class Day19HomeworkFifteen {
	public static void main(String[] args) {
		String resultOne=removeSpace(" Java Training");
		String resultTwo=removeSpace(" I like to practice");
		System.out.println(resultOne);
		System.out.println(resultTwo);

		
		
		
	}
	public static String removeSpace(String strOne) {
	
	
	String result= (strOne.trim());
	
	
	
	return result;
	}

}









/**
 15. Write a method to trim any leading or trailing whitespace from a given string
 

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne
Test Data:
removeSpace (“ Java Training ”) ----- java Training
removeSpace (“ I like to practice ”) ----- I like to practice

*/