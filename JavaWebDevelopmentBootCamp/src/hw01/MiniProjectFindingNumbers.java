package hw01;

public class MiniProjectFindingNumbers {

	public static void main(String[] args) {
		
		
		int[] numbers = new int[] {1 , 2, 5, 7, 9, 0};
		int searched = 0 ;
		boolean found = false;
		
		for(int number: numbers ) {
			if(searched == number) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("Number Found");
		}
		else {
			System.out.println("Number not found");
		}
			
			
		
		
		
		
		
		
		

	}

}
