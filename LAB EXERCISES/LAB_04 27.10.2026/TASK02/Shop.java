public interface Shop {
	 void addProduct(Product product) throws InvalidProductException;
	 void sellProduct(String name, int quantity) throws InsufficientStockException, InvalidProductException;
	 void listProducts();
}
