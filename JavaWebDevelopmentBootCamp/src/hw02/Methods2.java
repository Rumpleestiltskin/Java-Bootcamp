package hw02;

public class Methods2 {

	public static void main(String[] args) {
		
		String message = "Bugün hava çok güzel.";
		message.substring(0,2);
		
		String newMessage = returnCity();
		System.out.println(newMessage);
		
		int number = sum(15,7);
		System.out.println(number);
		
		int sum = sumAll(2,3,4,5,6,10);
		System.out.println(sum);

	}
	//Voidler de  return yok.
	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	
	public static void update() {
		System.out.println("Updated");
	}
	
	public static int sum(int numb1, int numb2) {
		return numb1 + numb2;
	}
	
	public static String returnCity() {
		return "Ankara";
	}
	
	public static int sumAll(int... numbers) {
		// 3 nokta variable arguments anlamına geliyor. integer array i göndermişiz gibi
		int sum = 0;
		for(int number : numbers) {
			//sum = sum + number
			sum += number;
		}
		return sum;
			
	}
}



