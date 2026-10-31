
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		//task 1
		/*
		Rocket r=new Rocket();
		System.out.print("Enter launch code: ");
		String code=inp.nextLine();
		try{
			r.transport(code);
		} catch (LaunchException e) {
			System.out.println("Грешка при изстрелване. "+e.getMessage());
	}
*/
		//task 2
		Shop coffeeShop = new CoffeeShop();
        Shop teaShop = new TeaShop();
        
        try {
        coffeeShop.addProduct(new Coffee("Капучино", 4.50, 20, "Арабика", 15));
        coffeeShop.sellProduct("Капучино", 5);

        teaShop.addProduct(new Tea("Зелен чай", 3.00, 30, "зелен", 3));
        teaShop.sellProduct("Зелен чай", 10);
        
    } catch (InvalidProductException e) {
        System.out.println("Грешка: " + e.getMessage());
    } catch (InsufficientStockException e) {
         System.out.println("Грешка: " + e.getMessage());
        }

    coffeeShop.listProducts();
    System.out.println();
    teaShop.listProducts();
    
}
}
