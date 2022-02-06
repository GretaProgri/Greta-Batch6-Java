package com.noorteck.java.day22;

public class Day22Homework22 {
	public static void main(String[] args) {
		int resultOne=occurrenceCount("java training", 'a');
		int resultTwo=occurrenceCount("java training", 'i');
		int resultThree=occurrenceCount("I love programming", 'm');
		int resultFour=occurrenceCount("Sunday", 'f');
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);

		
		
		
		
	}public static int occurrenceCount(String str, char c) {
		
		
		int result=0;
	
		
		
		for (int i=0; i < str.length(); i++) {
			if(str.charAt(i)==c) 
				result++;
		}
		return result;
		
			
	}
		

}

/**
 * 
 * int count = 0;

    for(int i=0; i < str.length(); i++)
    {    if(str.charAt(i) == c)
            count++;
    }

    return count;
}

22. Write a method that takes two parameters, String and char. Count the occurrence of a
given character in a string and return the value of how many times a character occurred
in a string

Access Modifier: public
Non-Access Modifier: static
Return Type: int
Method Name: occurenceCount
Parameter1: String str
Parameter2: char c
Test Data:
occurenceCount (“java training”, ‘a’) ----- 3
occurenceCount (“java training”, ‘i’) ----- 2
occurenceCount (“I love programming”, ‘m’) ----- 2
occurenceCount (“Sunday”, ‘f’) ----- 0




*/