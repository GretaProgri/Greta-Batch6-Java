package switchstatement;

public class SwitchStatement {

	public static void main(String[] args) {

		String colorOption = "Red";

		switch (colorOption) {

		case "red":
			System.out.println("The color is Red");

			break;
		case "orange":

			System.out.println("The Color is Orange");
			break;

		case "black":

			System.out.println("The Color is Black");
			break;

		default:
			System.out.println("Wrong Color, not available");

		}

	}

}
