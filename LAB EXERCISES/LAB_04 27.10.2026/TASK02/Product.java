
class InsufficientStockException extends Exception {
    public InsufficientStockException(String message) {
        super(message);
    }
}
class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}
public class Product {
private double price;
private int quantity;
private String productName;
public Product(String productName, double price, int quantity) throws InvalidProductException {
	if (price < 0) {
        throw new InvalidProductException("Невалидна цена: " + price);
    }
    if (quantity < 0) {
        throw new InvalidProductException("Невалидно количество: " + quantity);
    }
    this.productName = productName;
	this.price = price;
	this.quantity = quantity;
}
public String getProductName() {
	return productName;
}
public double getPrice() {
	return price;
}
public int getQuantity() {
	return quantity;
}
public void increaseQuantity(int amount) {
	quantity+=amount;
}
public void decreaseQuantity(int amount) throws InsufficientStockException {
	if(quantity>amount)quantity-=amount;
	else throw new InsufficientStockException("Недостатъчна наличност на "+productName);	
}
@Override
public String toString() {
	return productName + "(цена: " + price + "€, количество: " + quantity + " бр.)";
}

}
