package mypack.project;

// BankAccount.java
public class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public void deposit(double amount) throws InvalidAccountException {
		if(amount <=0) {
			throw new InvalidAccountException("Deposit ammount must be positive");
		}
		balance += amount;
		System.out.println("Deposited:" + amount);
	}
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAccountException{
		if(amount <=0) {
			throw new InvalidAccountException("Withdrawal amount must be positive");
		}
		if(amount > balance) {
			throw new InsufficientFundsException("Insufficient funds for withdrawal"); 
		}
		balance -= amount;
		System.out.println("Withdrawn:" + amount);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
