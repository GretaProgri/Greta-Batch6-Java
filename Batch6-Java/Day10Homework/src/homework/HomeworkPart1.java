package homework;

public class HomeworkPart1 {
	public static void main(String[] args) {

		calculateMethod(2.0, 5.0, '+');
		calculateMethod(2.0, 5.0, '-');
		calculateMethod(2.0, 5.0, '*');
		calculateMethod(2.0, 5.0, '/');
		calculateMethod(2.0, 5.0, '%');
		calculateMethod(2.0, 5.0, '!');
	}

	public static void calculateMethod(double numOne, double numTwo, char mathOperationSign) {
		double result;
		if (mathOperationSign == '+') {
			result = numOne + numTwo;
			System.out.println(numOne + " + " + numTwo + " = " + result);
		} else if (mathOperationSign == '-') {
			result = numOne - numTwo;
			System.out.println(numOne + " - " + numTwo + " = " + result);
		} else if (mathOperationSign == '*') {
			result = numOne * numTwo;
			System.out.println(numOne + " * " + numTwo + " = " + result);
		} else if (mathOperationSign == '/') {
			result = numOne / numTwo;
			System.out.println(numOne + " / " + numTwo + " = " + result);
		} else if (mathOperationSign == '%') {
			result = numOne % numTwo;
			System.out.println(numOne + " % " + numTwo + " = " + result);
		} else {
			System.out.println("Invalid Operator");
		}
	}
}
