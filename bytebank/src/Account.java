public class Account {
	//bank account simulator

	private double balance;
	private int bankBranch;
	private int number;
	private Client owner;//here we make a reference to another object (Client)
	private static int total = 0;

	public Account(int bankBranch, int number) {
		//this constructor forces the user to set the bank branch and the account number
		Account.total++;
		//this is just to test the static variable 
		System.out.println("The total number of accounts are " + Account.total);
		
		this.bankBranch = bankBranch;
		this.number = number;
		this.balance = 100;
		System.out.println("Creating the account number " + this.number);
	}

	public void toDeposit(double amount) {
		this.balance += amount;
	}

	public boolean withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfer(double amount, Account destination) {
		//testing if we can transfer money to other accounts
		if (this.balance >= amount) {
			this.balance -= amount;
			destination.toDeposit(amount);
			return true;
		}
		return false;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		if (number <= 0) {
			System.out.println("The amount cannot be equal or less than 0");
			return;
		}
		this.number = number;
	}

	public int getBankBranch() {
		return this.bankBranch;
	}

	public void setBankBranch(int bankBranch) {
		if (bankBranch <= 0) {
			System.out.println("The amount cannot be less than 0");
			return;
		}
		this.bankBranch = bankBranch;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
	}

	public Client getOwner() {
		return this.owner;
	}

	public static int getTotal() {
		//as 'total' is a static variable we have to make the method also static
		return Account.total;
	}

}