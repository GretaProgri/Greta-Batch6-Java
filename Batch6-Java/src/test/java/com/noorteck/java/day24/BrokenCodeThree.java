package com.noorteck.java.day24;

public class BrokenCodeThree {

	public static void main(String[] args) {

		String[] weekday = new String[5]; // no static in front

		weekday[0] = "Monday";
		weekday[1] = "Tuesday";
		weekday[2] = "Wednesday";
		weekday[3] = "Thursday";
		weekday[4] = "Friday";

		int num[] = { 1, 4, 5, 2, 6, 8 };

		System.out.println("Index 555 value: " + num[555]);

		for (int i = 0; i < num.length; i++) { // add int, and .length after num

			if (num[i] == 5) {
				System.out.println("My favorite number is there..");
			}
		}

		String student[] = { "Chelsea", "Milotina", "Danny", "Greg" };

		for (int i = 0; i < student.length; i++) {

			System.out.println(student);

			if (student[i].equals("John")) {
				System.out.println("Cena is in the house");

			}
		}

	}

}
