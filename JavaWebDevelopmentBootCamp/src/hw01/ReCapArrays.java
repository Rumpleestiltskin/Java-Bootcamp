package hw01;

public class ReCapArrays {

	public static void main(String[] args) {
		double[] mylist = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double maxNumb = mylist[0];
		for (double number : mylist) {
			if (maxNumb < number) {
				maxNumb = number;
			}
			total = total + number;
			System.out.println(number);

		}

		System.out.println("Total =" + total);
		System.out.println("Max number= " + maxNumb);
	}

}
