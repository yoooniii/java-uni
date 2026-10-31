public class CashPayment extends Payment{
    public CashPayment(double amount, String paymentMethod) {
        super(amount, "Плащане в брой");
    }
 
    @Override
    public void pay() {
        System.out.println(super.getPaymentMethod());
        super.showAmount();
    }
}
