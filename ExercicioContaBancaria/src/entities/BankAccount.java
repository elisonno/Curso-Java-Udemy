package entities;

public class BankAccount {
	private String numberAccount;
	private String accountHolder;
	private double balance;
	
	public BankAccount(String numberAccount, String accountHolder) {
		this.numberAccount = numberAccount;
		this.accountHolder = accountHolder;
	}
	
	public BankAccount(String numberAccount, String accountHolder, double balance) {
		this.numberAccount = numberAccount;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public double getBalance() {
		return balance;
	}
	
	public void depositValue(double balance) {
		this.balance += balance;
		
	}
	
	public void withdrawValue(double balance) {
		this.balance -= (balance + 5.00);
	}
	
	public String toString() {
		return "Account: " + getNumberAccount() 
		+", Holder: " + getAccountHolder() 
		+", Balance: $ " + String.format("%.2f", getBalance());
	}
	
	

}
