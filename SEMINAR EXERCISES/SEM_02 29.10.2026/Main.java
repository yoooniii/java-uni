    import java.util.Scanner;
     
    class Main{
        public static void main(String[] args){
            Scanner inp=new Scanner(System.in);
            System.out.println("Въведете метод за плащане: ");
            String paymentMethod=inp.nextLine();
            System.out.println("Въведете сума: ");
            double payment=inp.nextDouble();
            //PaymentFactory pf=new PaymentFactory();
            Payable pay = PaymentFactory.createPayment(paymentMethod, payment);
            Order order = new Order(pay);
     
            order.checkout();
        }
    }

