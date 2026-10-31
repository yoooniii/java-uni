public class CardPayment extends Payment{
    public CardPayment(double amount, String paymentMethod) {
        super(amount, "Плащане с карта");
    }
    @Override
    public void pay() {
        System.out.println(super.getPaymentMethod());
        super.showAmount();
    }
}
