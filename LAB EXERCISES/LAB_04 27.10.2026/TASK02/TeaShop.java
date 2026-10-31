import java.util.Arrays;

public class TeaShop implements Shop {
	private Tea[] teas = new Tea[2];
	private int count = 0;

	@Override
	public void addProduct(Product product) throws InvalidProductException {
		if (!(product instanceof Tea)) {
			throw new InvalidProductException("В чайната могат да се добавят само чайове.");
		}
		Tea tea = (Tea) product;

		// ако чаят вече съществува, увеличаваме количеството
		for (int i = 0; i < count; i++) {
			if (teas[i].getProductName().equalsIgnoreCase(tea.getProductName())) {
				teas[i].increaseQuantity(tea.getQuantity());
				return;
			}
		}

		// ако масивът е пълен, го удвояваме
		if (count == teas.length) {
			teas = Arrays.copyOf(teas, teas.length * 2);
		}
		teas[count++] = tea;
	}

	@Override
	public void sellProduct(String name, int quantity)
			throws InsufficientStockException, InvalidProductException {
		if (quantity <= 0) {
			throw new InvalidProductException("Невалидно количество: " + quantity);
		}
		for (int i = 0; i < count; i++) {
			if (teas[i].getProductName().equalsIgnoreCase(name)) {
				teas[i].decreaseQuantity(quantity); // хвърля InsufficientStockException
				return;
			}
		}
		throw new InvalidProductException("Няма такъв продукт: " + name);
	}

	@Override
	public void listProducts() {
		System.out.println("Налични продукти в чайната:");
		for (int i = 0; i < count; i++) {
			System.out.println(" - " + teas[i]);
		}
	}
}
