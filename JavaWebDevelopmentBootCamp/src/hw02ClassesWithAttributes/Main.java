package hw02ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Black","L1");
		
		
	/*	product.setName("Laptop"); 
		product.setId(1); 
		product.setDescription("Asus Laptop");
		product.setStockAmount(3);
		product.setPrice(5000); 
		product.setColor(""); 
		product.setCode("L1");  */
		
		System.out.println(product.getName());
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product);
		
		System.out.println(product.getCode());
		
		Product product2 = new Product();
		
		product2.setName("Playstation");
		product2.setId(2);
		product2.setDescription("Sony");
		product2.setStockAmount(5);
		product2.setPrice(10000);
		product2.setColor("black.jpg");
		product2.setCode("P2");
		
		productManager.add(product2);
		
		System.out.println(product2.getCode());
		
		
		

	}

}
