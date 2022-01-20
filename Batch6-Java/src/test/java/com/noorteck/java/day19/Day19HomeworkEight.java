package com.noorteck.java.day19;

public class Day19HomeworkEight {
	
	public static void main(String[] args) {
		Day19HomeworkEight.getCharacter("java training", 2);
		Day19HomeworkEight.getCharacter("java training", 5);
		Day19HomeworkEight.getCharacter("java training", 8);
		Day19HomeworkEight.getCharacter("java training", 22);

		
	
		
	}
	public static char getCharacter(String strOne, int indexNum) {
	char result= ' ';
	
	if (indexNum > strOne.length()) {
		System.out.println("?");
		
	} else {
		System.out.println(strOne.charAt(indexNum));
	}
	
	
	
	return result;
	
	}

}



/**

8. Write a method that takes two parameters, one String parameter and one integer
parameter. The method should return the character at the given index within the String.
If the indexNum more than the length of String then return ‘?’ mark
Access Modifier: public
Non-Access Modifier: static
Return Type: char
Method Name: getCharacter
Parameter1: String strOne
Parameter2: Int indexNum
Test Data:
getCharacter (“java training”, 2) ----- v
getCharacter (“java training”, 5) ----- t
getCharacter (“java training”, 8) ----- i
getCharacter (“java training”, 22) ----- ?

----------------------------------------------------------------------------------------------------------------




*/