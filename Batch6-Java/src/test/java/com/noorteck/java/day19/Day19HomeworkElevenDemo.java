package com.noorteck.java.day19;

public class Day19HomeworkElevenDemo {
	public static void main(String[] args) {
		Day19HomeworkElevenDemo obj = new Day19HomeworkElevenDemo();
		obj.threeEqual("Java Pro", 'P', 'B');
		obj.threeEqual("Lazy mode", 'm', 'C');
		obj.threeEqualOne("Training", 'T', ' ');

	}

	protected String threeEqual(String str, char oldChar, char newChar) {
		String result = " ";

		System.out.println(str.substring(0, 5) + newChar + str.substring(6, 8));
		

		return result;
	}

	protected String threeEqualOne(String strOne, char oldCharOne, char newCharOne) {
		String result = " ";

		System.out.println(strOne.substring(1, 8));
		return result;

		
	}
}

/**
 * 
 * threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro 
 * threeEqual (“Lazy mode”,‘m‘, ‘C‘) ----- Lazy Cod 
 * threeEqual (“Training”, ‘T’, ‘ ‘) ----- raining
 */