package com.noorteck.java.day19;

public class Day19HomeworkThree {
	
	public static void main(String[] args) {
		Day19HomeworkThree obj = new Day19HomeworkThree();
		obj.toUpper("Pro");
		obj.toUpper("java");
		obj.toUpper("java training");
		
	}
	

	private String toUpper(String strOne) {
		
		System.out.println(strOne.toUpperCase());
		return strOne;
	
	}
	
	

}



/**


Write a method that takes one String parameter and the method converts the
parameter to uppercase and return the new String value

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
Test Data:
toUpper (“Pro”) ----- PRO
toUpper (“java”) ----- LEARNING
toUpper (“java training”) ----- JAVA TRAINING

----------------------------------------------------------------------------------------------------------------

*/