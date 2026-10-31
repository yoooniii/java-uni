
public class Coffee extends Product{
private String type;
private double caffeineMg;

public Coffee(String productName, double price, int quantity, String type, double caffeineMg)
		throws InvalidProductException {
	super(productName, price, quantity);
	this.type = type;
	this.caffeineMg = caffeineMg;
}
public String getType() {
	return type;
}
public double getCaffeineMg() {
	return caffeineMg;
}


}
