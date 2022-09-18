package hw01;

public class MiniProjectPrimeNumbers {

	public static void main(String[] args) {
		int number = 53;
		//int remainder = number % 2;
		// system.out.println(remainder);
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Not a Prime Number");
			return;
		}
		

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		

		}
		
		if(isPrime) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}

	}
}
