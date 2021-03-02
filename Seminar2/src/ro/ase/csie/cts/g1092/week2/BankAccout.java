package ro.ase.csie.cts.g1092.week2;

public abstract class BankAccout extends Account{
	protected double balance;
	protected final String iban;
	
	public BankAccout(double balance, String iban) {
		this.balance = balance;
		this.iban = iban;
		
	}

	@Override
	public double getBalance() {
		return this.balance;
	}
}
