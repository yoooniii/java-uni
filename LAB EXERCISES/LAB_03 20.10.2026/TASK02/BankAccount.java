public abstract class BankAccount {
	public double balance;
	
public void deposit(double amount) {
	if(amount>0) balance+=amount;
}
public void withdraw(double amount) {
	if (amount>0 && amount<=balance)balance-=amount;
    else System.out.println("Недостатъчна наличност или невалидна сума.");
}
public abstract void calculateInterest(double ratePercent);

public double getBalance() {
    return balance;
 }
}
