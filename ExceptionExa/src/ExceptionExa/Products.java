package ExceptionExa;

class ProductNotFound extends Exception{
	static String notFound = "Product Key Invalid, Try some other key.";
	public ProductNotFound() {
		super(notFound);
	}
}

public class Products {
	static String[] ProductsList = {"Phone","Laptop","Washing machine","TV","Geyser"};
	static int validKey = ProductsList.length;
	
	private static void bring(int productNumber) throws ProductNotFound{
		 if(productNumber >= validKey|| productNumber < 0)
			 throw new ProductNotFound();
		 else System.out.println(ProductsList[productNumber-1]);
		
	}

	public static void main(String[] args) throws ProductNotFound {
		System.out.println("Fetching some products...");
		bring(2);
		bring(6);

	}

}
