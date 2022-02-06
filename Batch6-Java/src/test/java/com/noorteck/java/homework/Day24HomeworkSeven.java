package com.noorteck.java.homework;

public class Day24HomeworkSeven {

	public static void main(String[] args) {

		int arrayOne[] = { 88, 22, 6, 1, 2, 3, 88, 22, 44, 33 };
		int numberOne = 3;
		int arrayTwo[] = { 1, 2, 3, 22, 44, 33 };
		int numberTwo = 12;
		int arrayThree[] = { 88, 22, 6, 1, 8, 0 };
		int numberThree = 22;
		int arrayFour[] = { 2, 3, 88, 22, 44 };
		int numberFour = 44;

		int resultOne = getIndexNumber(arrayOne, numberOne);
		int resultTwo = getIndexNumber(arrayTwo, numberTwo);
		int resultThree = getIndexNumber(arrayThree, numberThree);
		int resultFour = getIndexNumber(arrayFour, numberFour);

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);

	}

	public static int getIndexNumber(int[] number, int elementValue) {

		int result = -1;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == elementValue) {
				return i;
			}
		}

		return result;

	}

}

/**
 * 
 * 7. Write a method that takes 2 parameters. An array of int parameter and
 * integer parameter. Find the index number of an array element. Check if an
 * array has the element value passed as 2nd parameter. If it contains return
 * the index number of that element otherwise return -1.
 * 
 * Access Modifier: public Non-Access Modifier: static Return Type: int Method
 * Name: getIndexNumber Parameter1: int [] number Parameter1: int elementValue
 * Test Data: getIndexNumber ([88,22,6, 1, 2, 3, 88,22,44,33], 3) ----- 5
 * getIndexNumber ([1, 2, 3,22,44,33], 12) ----- -1 getIndexNumber ([88,22,6,
 * 1,8,0], 22) ----- 1 getIndexNumber ([2, 3, 88,22,44], 44) ----- 4
 * 
 * 
 */