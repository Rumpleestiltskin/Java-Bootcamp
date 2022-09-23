package hw02;

public class Methods {

	public static void main(String[] args) {
		
		findingNumber();
		findingNumber();
		findingNumber();
		findingNumber();
		

	}
	//camelCase
	public static void findingNumber() {

		int[] numbers = new int[] {1 , 2, 5, 7, 9, 0};
		int searched = 6 ;
		boolean found = false;
		
		for(int number: numbers ) {
			if(searched == number) {
				found = true;
				break;
			}
		}
		if(found) {
			giveFeedback("Number Found: " + searched);
		}
		else {
			giveFeedback("Number not found: " + searched);
		}
	}

	public static void giveFeedback(String message) {
		
		System.out.println(message);
		
		
	}








}


