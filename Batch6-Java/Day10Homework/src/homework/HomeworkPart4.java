package homework;

public class HomeworkPart4 {
	public static void main(String[] args) {
		getWhileLoopResult(4, 21);
	}

	public static void getWhileLoopResult(int minNum, int maxNum) {
		
		do {
			System.out.println(minNum);
			minNum++;

		} while (minNum <= maxNum);

	}

}
