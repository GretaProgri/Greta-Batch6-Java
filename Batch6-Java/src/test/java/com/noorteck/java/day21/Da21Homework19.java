package com.noorteck.java.day21;

public class Da21Homework19 {
	public static void main(String[] args) {
		boolean resultOne= isSame("educated");
		boolean resultTwo=isSame("modified memo");
		boolean resultThree=isSame("I am studying");
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		
		
		
		
		
		
	}public static boolean isSame(String strOne) {
		boolean result= false;
		
		if (strOne.length() <2){
			
			return result;
		}
		String firstTwo = strOne.substring(0, 2);
		
		int lastTwoIndex = strOne.length()-2;
		String lastTwo=strOne.substring(lastTwoIndex);
		
		if (firstTwo.equals(lastTwo)) {
			result=true;
		}
		
	
		
		return result;
	}

}




/**

19. Write a method to return true from a given string if the first two characters in the string
also appear at the end

Access Modifier: public
Non-Access Modifier: static
Return Type: boolean
Method Name: isSame
Parameter1: String strOne
Test Data:
isSame (“educated”) ----- TRUE
isSame (“modified memo”) ----- TRUE
isSame (“I am studying”) ----- FALSE



*/