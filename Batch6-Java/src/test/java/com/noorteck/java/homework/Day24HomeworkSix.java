package com.noorteck.java.homework;

public class Day24HomeworkSix {
	public static void main(String[] args) {

		int numberOne[] = { 6, 1, 2, 3 };
		int numberTwo[] = { 13, 2, 3, 4, 6, 1, 2, 3 };
		int numberThree[] = { 3, 3, 0, 1, 4, 3, 6 };
		int numberFour[] = { 2, 6, 2 };

		boolean resultOne = checkNum(numberOne);
		boolean resultTwo = checkNum(numberTwo);
		boolean resultThree = checkNum(numberThree);
		boolean resultFour = checkNum(numberFour);

		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}

	protected static boolean checkNum(int[] number) {
		boolean result = false;

		int two = 0;
		int five = 0;

		for (int i = 0; i < number.length; i++) {
			if (number[i] == 2) {
				two++;

			}
			if (number[i] == 5) {
				five++;

			}
		}
		if (two == 2 || five == 2) {

			result = true;

		}
		return result;
	}

}
/**
 * 6. Write a method that takes an array of int parameter and return true if the
 * array contains value 2 twice, or value 5 twice.
 * 
 * Access Modifier: protected Non-Access Modifier: static Return Type: boolean
 * Method Name: checkNum Parameter1: int [] number Test Data: checkNum ([6, 1,
 * 2, 3]) ----- FALSE checkNum ([13, 2, 3,4, 6, 1, 2, 3]) ----- TRUE checkNum
 * ([3, 3,0, 1, 4, 3 ,6]) ----- FALSE checkNum [2, 6, 2]) ----- TRUE
 * 
 * 
 * 
 */
