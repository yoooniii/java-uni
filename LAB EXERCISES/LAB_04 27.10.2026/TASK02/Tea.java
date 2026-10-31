
public class Tea extends Product{
private String sort;
private int brewTime;
public Tea(String productName, double price, int quantity,String sort, int brewTime) throws InvalidProductException {
super(productName, price, quantity);
	this.sort = sort;
	this.brewTime = brewTime;
}
public String getSort() {
	return sort;
}
public int getBrewTime() {
	return brewTime;
}

}
