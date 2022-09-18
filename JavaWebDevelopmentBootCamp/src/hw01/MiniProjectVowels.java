package hw01;

public class MiniProjectVowels {

	public static void main(String[] args) {

		char harf = 'A';
/*Benim çözümüm.
		char[] bVowels = { 'a', 'A', 'ı', 'I', 'o', 'O', 'u', 'U' };
		char[] tVowels = { 'e', 'E', 'i', 'İ', 'ö', 'Ö', 'ü', 'Ü' };
		char[] Vowels = {'a', 'A', 'ı', 'I', 'o', 'O', 'u', 'U','e', 'E', 'i', 'İ', 'ö', 'Ö', 'ü', 'Ü'};

		for (char bLetter : bVowels) {
			if (harf == bLetter) {
				System.out.println("Bold Vowel");
				return;
			}
		}

		for (char tLetter : tVowels) {
			if (harf == tLetter) {
				System.out.println("Thin Vowel");
				return;

			}

		}
		
		for (char letter : Vowels) {
			if (harf != letter) {
				System.out.println("Not a Vowel");
				return;
				
			}
		} */
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Bold Vowel");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Thin Vowel");
			break;
		default:
			System.out.println("Not a Vowel");
		
		}
		

	}
}