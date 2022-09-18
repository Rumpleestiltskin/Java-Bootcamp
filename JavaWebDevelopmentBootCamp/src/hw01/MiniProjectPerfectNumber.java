package hw01;

public class MiniProjectPerfectNumber {

	public static void main(String[] args) {

		int number = 496;
		int total = 0;

		boolean perfectNumb = false;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
				if (total == number) {
					perfectNumb = true;

				}

			}
		}
		
		if(perfectNumb) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not a Perfect Number");
		}

	}

}
