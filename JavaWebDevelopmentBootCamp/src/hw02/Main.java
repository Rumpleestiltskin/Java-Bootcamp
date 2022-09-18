package hw02;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Darkness My Old Friend");
		
		//Değişken isimlendirmeleri java 'da camelCase yazılır.
		String ortaMetin = "İlginizi çekebilir" ;
		String altMetin  = "Vade süresi" ;
		
		System.out.println(ortaMetin);
		
		int vade = 12 ;
		
		double dolarDun = 18.25 ;
		double dolarBugun = 18.25 ;
		
		boolean dolarChange = false;
		
		String okYonu = "" ;
		
		if (dolarDun>dolarBugun) {
			okYonu = "down.svg" ;
			System.out.println(okYonu);
			
		} else if(dolarDun<dolarBugun) {
			okYonu = "up.svg" ;
			System.out.println(okYonu);
		}
		
		else {
			okYonu = "equal.svg" ;
			System.out.println(okYonu);

		}
		
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		//++ birer birer artsın anlamında
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
		
		
	}

}
