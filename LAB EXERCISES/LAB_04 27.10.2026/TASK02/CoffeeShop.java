import java.util.Arrays;
public class CoffeeShop implements Shop {
	private Coffee[] coffees = new Coffee[2];
	private int count = 0;

	@Override
	public void addProduct(Product product) throws InvalidProductException {
		if (!(product instanceof Coffee)) {
			throw new InvalidProductException("В кафенето могат да се добавят само кафета.");
		}
		Coffee coffee = (Coffee) product;

		// ако кафето вече съществува, увеличаваме количеството
		for (int i = 0; i < count; i++) {
			if (coffees[i].getProductName().equalsIgnoreCase(coffee.getProductName())) {
				coffees[i].increaseQuantity(coffee.getQuantity());
				return;
			}
		}

		// ако масивът е пълен, го удвояваме
		if (count == coffees.length) {
			coffees = Arrays.copyOf(coffees, coffees.length * 2);
		}
		coffees[count++] = coffee;
	}

	@Override
	public void sellProduct(String name, int quantity)
			throws InsufficientStockException, InvalidProductException {
		if (quantity <= 0) {
			throw new InvalidProductException("Невалидно количество: " + quantity);
		}
		for (int i = 0; i < count; i++) {
			if (coffees[i].getProductName().equalsIgnoreCase(name)) {
				coffees[i].decreaseQuantity(quantity); // хвърля InsufficientStockException
				return;
			}
		}
		throw new InvalidProductException("Няма такъв продукт: " + name);
	}

	@Override
	public void listProducts() {
		System.out.println("Налични продукти в кафенето:");
		for (int i = 0; i < count; i++) {
			System.out.println(" - " + coffees[i]);
		}
	}
}
