public class PaymentFactory {
    static Payable createPayment(String type, double amount){
        if(type.equals("card")) return new CardPayment(amount,type);
        else if(type.equals("cash"))  return new CashPayment(amount,type);
        return null;
    }
}
