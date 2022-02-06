package com.noorteck.java.day21;

public class Day21Homework20 {
	
	
	public static void main(String[] args) {
	String resultOne=	removeT("Test Data");
		String resultTwo= removeT("Testcricket");
		String resultThree= removeT("I am studying");
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		
		
		
	}public static String removeT(String strOne) {
		String result="";
		
		if (strOne.substring(0,1).equalsIgnoreCase("t")) {
			strOne=strOne.substring(1);
		
	}
		int lastIndex= strOne.length()-1;
		
		if (strOne.substring(lastIndex).equalsIgnoreCase("t")){
			strOne=strOne.substring(0, lastIndex);
		}
		result=strOne;
		return result;
}

}

/**

20. Write a method that takes a string parameter. Check if the first or last characters in the
string parameter are 't', return the string without those 't' otherwise return the string
unchanged.

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeT
Parameter1: String strOne
Test Data:
removeT (“Test Data”) ----- est Data
removeT (“Testcricket”) ----- estcricke
removeT (“I am studying”) ----- I am studying


*/