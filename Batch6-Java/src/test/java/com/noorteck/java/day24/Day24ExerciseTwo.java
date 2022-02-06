package com.noorteck.java.day24;

public class Day24ExerciseTwo {
	public static void main(String[] args) {
		char c1[] = { 'a', 'b', 'x', 'd', 'a', 'd', 'e', 'q', 'a' };
		char c2[] = { 'x', 'd', 'a', 'd', 'e', 'q', 'a' };
		char c3[] = { 'e', 'd', 'a', 'd', 'e', 'q', 'a', 'e' };
		char c4[] = { 'a' };

		Day24ExerciseTwo obj = new Day24ExerciseTwo();
		boolean resultOne = obj.sameFirstLast(c1);
		boolean resultTwo = obj.sameFirstLast(c2);
		boolean resultThree = obj.sameFirstLast(c3);
		boolean resultFour = obj.sameFirstLast(c4);
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);

	}

	protected boolean sameFirstLast(char[] c) {
		boolean result = false;

		char firstElement = c[0];
		char lastElement = c[c.length - 1];

		if (c.length > 1 && firstElement == lastElement) {
			return true;

		}
		return result;
	}

}

/**
 * 2. Write a method that takes an array of char parameter and return true if
 * the array size/length is more than 1 and the first element and the last
 * element in the array are equal, otherwise return false Access Modifier:
 * protected Non-Access Modifier: non-static Return Type: boolean Method Name:
 * sameFirstLast Parameter1: char [] c Test Data: sameFirstLast
 * ([‘a’,’b’,’x’,’d’,’a’,d’,’e’,’q’,’a’]) ----- TRUE sameFirstLast
 * ([’x’,’d’,’a’,d’,’e’,’q’,’a’]) ----- FALSE sameFirstLast
 * ([’e’,’d’,’a’,d’,’e’,’q’,’a’ ,’e’]) ----- TRUE sameFirstLast ([‘a’]) -----
 * FALSE
 * 
 * ----------------------------------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 */