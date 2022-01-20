package com.noorteck.java.day19;

public class Day19HomeworkTen {
	
	public static void main(String[] args) {
		
		Day19HomeworkTen obj= new Day19HomeworkTen();
		obj.isEndWith("java training", "ing");
		obj.isEndWith("java training", "ng");
		obj.isEndWith("java training", "java");
		obj.isEndWith("java training", "train");

		
		
		
	}
	boolean isEndWith(String strOne, String strTwo) {
		boolean result= false;
		
		if (strOne.endsWith(strTwo)) {
			System.out.println("True");
		
	} else {
		System.out.println("False");
	}
	return result;
	
	}
}
	




/**

10. Write a method to check whether a given string ends with the contents(Characters) of
another string

Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isEndWith
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
isEndWith (“java training”, “ing”) ----- TRUE
isEndWith (“java training”, “ng”) ----- TRUE
isEndWith (“java training”, “java”) ----- False
isEndWith (“java training”, “train”) ----- False



*/