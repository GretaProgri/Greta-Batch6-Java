package com.noorteck.java.day19;

public class Day19HomeworkOne {
	
	public static void main(String[] args) {
	boolean resultOne= isEqual("sdet", "SDET");
	boolean resultTwo= isEqual("testing", "testing");
	boolean resultThree=isEqual("java", "java");
	boolean resultFour=isEqual("java", "java Programming");
	
	System.out.println(resultOne);
	System.out.println(resultTwo);
	System.out.println(resultThree);
	System.out.println(resultFour);
	}
	 static boolean isEqual (String strOne, String strTwo) {
		boolean result=false;
		if (strOne.equals(strTwo)) {
			result = true;
			
		
		}
		
		return result;
	}
}
	 


/**
 * 1. Write a method that takes two String parameter and checks if the two strings are equal
or not. If they are equal return true, otherwise return false
Access Modifier: Default
Non-Access Modifier: static
Return Type: boolean
Method Name: isEqual
Parameter1: String strOne
Parameter2: String strTwo
Test Data:
isEqual (“sdet”, “SDET”) ----- FALSE
isEqual (“testing”, “testing”) ----- TRUE
isEqual (“java”, “java”) ----- TRUE
isEqual (“java”, “java Programming”) ----- FALSE
 */
