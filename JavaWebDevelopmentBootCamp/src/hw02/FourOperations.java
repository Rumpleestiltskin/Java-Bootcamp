package hw02;

public class FourOperations {

	public static void main(String[] args) {

		FourOperation calculator = new FourOperation();

		int sum = calculator.Add(1, 5, 6, 7);
		System.out.println(sum);

		int substract = calculator.Substract(2, 3, 5);
		System.out.println(substract);

		int multiply = calculator.Multiply(6, 5, 2);
		System.out.println(multiply);

		double divide = calculator.Divide(-40, 0, 4);
		System.out.println(divide);

	}

}

 	class FourOperation {

	public int Add(int... numbers) {

		int sum = 0;

		for (int number : numbers) {

			sum += number;

		}
		return sum;
	}

	public int Substract(int... numbers) {

		int diff = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			diff = diff - numbers[i];
		}
		return diff;
	}

	public int Multiply(int... numbers) {

		int result = 1;

		for (int number : numbers) {

			result = result * number;
			

		}
		return result;
	}

	public double Divide(double... numbers) {

		double result = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			result = result / numbers[i];
		}
		return result;

	}
}
