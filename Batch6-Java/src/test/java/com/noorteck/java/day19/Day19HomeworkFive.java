package com.noorteck.java.day19;

public class Day19HomeworkFive {

	public static void main(String[] args) {
		Day19HomeworkFive.combineStr("day", "ONE", "work", "Hours");
		Day19HomeworkFive.combineStr("week", "weekend", "monday", "Tuesday");
		Day19HomeworkFive.combineStr("restoN", "vA", "baltimore", "MD");
		Day19HomeworkFive.combineStr("java", "is", "fun", "LEARNING");

	}

	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {

		String result = "";
		System.out.println(strOne.toUpperCase());

		System.out.println(strThree.toUpperCase());

		System.out.println(strTwo.toLowerCase());

		System.out.println(strFour.toLowerCase());

		String newStr = strOne.concat(strTwo);

		String newStr1 = strThree.concat(strFour);

		String total = newStr.concat(newStr1);

		System.out.println(total);

		return result;

	}

}
/**
 * 
 * 6. Write a method that takes four String parameters, the method a. converts
 * parameter 1 and parameter 3 to uppercase, b. converts parameter 2 and
 * parameter 4 to lower case c. Then the method concatenates all four parameters
 * and return the new String value.
 * 
 * Access Modifier: protected Non-Access Modifier: static Return Type: String
 * Method Name: combineStr Parameter1: String strOne Parameter2: String strTwo
 * Parameter3: String strThree Parameter3: String strFour Test Data: combineStr
 * (“day”, “ONE”, “work”,”HOURS”) ----- DAYoneWORKhours combineStr (“week”,
 * “weekend”, “monday”,”Tuesday”) - WEEKweekendMONDAYtuesday combineStr
 * (“restoN”, “vA”, “baltiMORE”, “MD”) ----- RESTONvaBALTIMOREmd combineStr
 * (“java”, “is”, “fun”,”LEARNING”) --- JAVAisFUNlearning
 * 
 * 
 * 
 * 
 * 
 */