public class SavingsAccount extends BankAccount{

	@Override
	public void calculateInterest(double ratePercent) {
		balance+=balance*ratePercent/100;
	}
}
