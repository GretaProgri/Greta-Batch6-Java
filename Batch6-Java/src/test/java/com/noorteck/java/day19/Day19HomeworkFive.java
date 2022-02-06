package com.noorteck.java.day19;

public class Day19HomeworkFive {

	public static void main(String[] args) {
		String resultOne=combineStr("day","One","work","Hours");
		System.out.println(resultOne);

	}

	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {

		String result = "";
		

		String newStr = strOne.toUpperCase()+strTwo.toLowerCase();

		String newStr2 = strThree.toUpperCase()+ strFour.toLowerCase();
		result = newStr.concat(newStr2);

	

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