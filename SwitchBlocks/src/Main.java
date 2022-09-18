
public class Main {

	public static void main(String[] args) {
		char grade = 'H';

		switch (grade) {
		case 'A':
			System.out.println("Perfect Score");
			break;
		case 'B':
			System.out.println("Nice score");
			break;
		case 'C':
			System.out.println("Average score");
			break;
		case 'D':
			System.out.println("Barely passed");
			break;
		case 'F':
			System.out.println("Failed");
			break;
		default:
			System.out.println("You didn't enter a valid grade");

		}

	}

}
