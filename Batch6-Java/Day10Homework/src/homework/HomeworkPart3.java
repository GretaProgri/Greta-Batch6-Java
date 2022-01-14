package homework;

public class HomeworkPart3 {

	public static void main(String[] args) {
		oddEven(5);
		oddEven(8);
	}
	
	public static void oddEven(int number) {

		if (number % 2 == 0) {
			System.out.println("The number is an even number");

		} else {
			System.out.println("The number is an odd number");

		}
	}
}

