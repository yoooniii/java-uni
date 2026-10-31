public abstract class Payment implements Payable{
    double  amount;
    String paymentMethod;
 
    public Payment(double amount,String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }
    public double getAmount() {
        return amount;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void showAmount(){
        System.out.println("Сума: "+getAmount()+"лв.");
    }
}
