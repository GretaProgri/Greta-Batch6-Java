package homework;

public class MonkeyStatus {
	public static void main(String[] args) {
		boolean areWeInTrouble = monkeyTrouble(false, true);
		System.out.println(areWeInTrouble);

	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean result = false;
		
			if (aSmile == bSmile) {
				result = true;
			}
			return result;

	}

}

