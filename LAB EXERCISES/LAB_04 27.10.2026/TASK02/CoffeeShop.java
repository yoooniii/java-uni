public class CoffeeShop implements Shop{
	 private Coffee[] coffees=new Coffee[2];
	 private int count=0;
	@Override
	public void addProduct(Product product) throws InvalidProductException {
		if(!(product instanceof Coffee))throw new InvalidProductException("Няма такъв продукт.");
		
	}

	@Override
	public void sellProduct(String name, int quantity) throws InsufficientStockException, InvalidProductException {
		if(quantity<=0)throw new InsufficientStockException("Няма достатъчно налични продукти.");
		
	}

	@Override
	public void listProducts() {
		 System.out.println("Налични продукти в кафенето:");
		for(int i=0;i<count;i++) {
			System.out.println(" - "+coffees[i]);
		}
		
	}

}
