package com.broken;

public class TheDad extends TheGrandPa {

	protected int age;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge(int age) {
		return age;
	}

	public void randomNum() {
		int number[] = { 1, 43, 3, 65, 8, 67, 9, 23, 
				98, 12, 12, 45, 7, 0, 99, 34, 11, 54 };

		for (int i = 0; i < number.length; i++){

			System.out.println(number[i]);

		}

	}

}
