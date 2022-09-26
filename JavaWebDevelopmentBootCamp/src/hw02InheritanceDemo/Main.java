package hw02InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		
		ogretmenKrediManager.calculate();
		
		KrediUI krediUI = new KrediUI();
		
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
		

	}

}
