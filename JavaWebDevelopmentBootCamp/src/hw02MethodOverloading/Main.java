package hw02MethodOverloading;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();
		System.out.println(fourOperations.add(2, 3));
		fourOperations.add(2, 3, 5);

	}

}
