package switchstatement;

public class Switchstatment2 {

	public static void main(String[] args) {

		char gender = 'm';

		switch (gender) {

		case 'f':

			System.out.println("Gender is female");
			break;

		case 'F':

			System.out.println("Gender is female");
			break;

		case 'm':
			System.out.println("Gender is Male");
			break;

		case 'M':

			System.out.println("Gender is female");
			break;

		default:
			System.out.println("Unspecified gender");

		}

	}

}
