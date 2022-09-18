
public class Main {

	public static void main(String[] args) {
		
		int numb1 = 225;
		int numb2 = 5353;
		int numb3 = 3735 ;
		
		//int[] list = {numb1, numb2, numb3};
		//int maxNumb = -1;
	
		//for (int i = 0; i < list.length; i++ ) {
		//	if (list[i] > maxNumb) {
		//		maxNumb = list[i];
		
				
		//	}
			
		//}
		//System.out.println(maxNumb);
		
		int enByk = numb1;
		
		if(enByk < numb2) {
			enByk = numb2;
		}
		if(enByk < numb3){
			enByk = numb3;
		}	
		System.out.println("En büyük =" + enByk);
		
		

	}

}
