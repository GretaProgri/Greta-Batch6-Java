package com.noorteck.java.day21;

public class Day21Homework17 {
	public static void main(String[] args) {
		Day21Homework17 obj= new Day21Homework17();
		boolean resultOne= obj.endsWithNG("I like to Practice");
		boolean resultTwo= obj.endsWithNG("Everone is practicing");
		boolean resultThree=obj.endsWithNG("I am studying");
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

		
		
		
		
	} public boolean endsWithNG (String strOne) {
		boolean result= false;
		
		if (strOne.endsWith("ng")) {
			result =true; 
		
		}
		return result;
	}


}


/**
17. Write a method that takes a string parameter and return true if the string parameter
ends in "ng"

Access Modifier: public
Non-Access Modifier: non-static
Return Type: boolean
Method Name: endsWithNG
Parameter1: String strOne
Test Data:
endsWithNG (“I like to practice”) ----- FALSE
endsWithNG (“Everyone is practicing”) ----- TRUE
endsWithNG (“I am studying”) ----- TRUE






*/