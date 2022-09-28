package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"laptop","dell", 400, 3000, "black");
		/*
		 * product.setName("pc"); product.setId(1); product.setDescription("dell");
		 * product.setPrice(5000); product.setStockAmount(200);
		 * product.setCode("KSXDF5000");
		 */

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
