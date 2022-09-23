package hw02;

public class Classes {

	public static void main(String[] args) {
		
		CustomerManager customerManager  = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();

		customerManager = customerManager2;

		customerManager.add();
		customerManager.remove();
		customerManager.update();

		// STACK-HEAP
		// value type'lar stackte oluşur heaple alakası yok
		int number1 = 10;
		int number2 = 20;

		number2 = number1;
		number1 = 30;
		System.out.println(number2);

		// arrayler reference type
		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };

		numbers2 = numbers1;
		numbers1[0] = 10;

		System.out.println(numbers2[0]);

		
	}

	public static class CustomerManager {
		public void add() {
			System.out.println("Customer Added");
		}
		
		public void remove() {
			System.out.println("Customer Removed");
			
		}
		
		public void update() {
			System.out.println("Customer Updated");
			
			
		}

	}

}
