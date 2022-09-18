package miniProjectFriendNumbers;

public class Main {

	public static void main(String[] args) {
		
		int number1 = 17296;
		int number2 = 18416;
		int total1 = 0;
		int total2 = 0;
		boolean friendNumb = false;
		
		for(int i = 1 ; i < number1 ; i++) {
			if(number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		
		for(int j = 1 ; j < number2 ; j++) {
			if(number2 % j == 0) {
				total2 = total2 + j;
			}
		}
		
		
		if(total1 == number2) {
			if(total2 == number1) {
				friendNumb = true;
			}

			
		}
		
		if(friendNumb) {
			System.out.println("Friend Numbers");
		}else {
			System.out.println("Not Friend Numbers");
		}
		


	}

}
