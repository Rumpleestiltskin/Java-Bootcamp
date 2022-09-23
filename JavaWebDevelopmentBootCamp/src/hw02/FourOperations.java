package hw02;

public class FourOperations {

	public static void main(String[] args) {

		FourOperation calculator = new FourOperation();

		int sum = calculator.add(1, 5, 6, 7);
		System.out.println(sum);

		int substract = calculator.substract(2, 3, 5);
		System.out.println(substract);

		int multiply = calculator.multiply(6, 5, 2);
		System.out.println(multiply);

		double divide = calculator.divide(-40, 0, 4);
		System.out.println(divide);

	}

}

 	class FourOperation {

	public int add(int... numbers) {

		int sum = 0;

		for (int number : numbers) {

			sum += number;

		}
		return sum;
	}

	public int substract(int... numbers) {

		int diff = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			diff = diff - numbers[i];
		}
		return diff;
	}

	public int multiply(int... numbers) {

		int result = 1;

		for (int number : numbers) {

			result = result * number;
			

		}
		return result;
	}

	public double divide(double... numbers) {

		double result = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			result = result / numbers[i];
		}
		return result;

	}
}
