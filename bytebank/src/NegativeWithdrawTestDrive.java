public class NegativeWithdrawTestDrive {
	//this analyzes if there are enough money to withdraw
	public static void main(String[] args) {
		Account account = new Account(6646,969060);
		account.toDeposit(100);
		System.out.println(account.withdraw(101));

		account.withdraw(101);

		System.out.println(account.getBalance());

	}
}