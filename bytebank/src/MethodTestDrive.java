public class MethodTestDrive {
	public static void main(String[] args) {
		Account accountOfPaulo = new Account(6646,969060);
		accountOfPaulo.toDeposit(100);
		accountOfPaulo.toDeposit(50);
		System.out.println(accountOfPaulo.getBalance());

		boolean withdrawSuccess = accountOfPaulo.withdraw(20);
		System.out.println(accountOfPaulo.getBalance());
		System.out.println(withdrawSuccess);

		Account accountOfAnna = new Account(6644,969063);
		accountOfAnna.toDeposit(1000);

		boolean transferSuccess = accountOfAnna.transfer(300, accountOfPaulo);

		if (transferSuccess) {
			System.out.println("Successfully delivered");

		} else {
			System.out.println("Not enough money");

		}
		System.out.println(accountOfAnna.getBalance());
		System.out.println(accountOfPaulo.getBalance());
	}

}