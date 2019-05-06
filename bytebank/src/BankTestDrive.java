public class BankTestDrive {
	public static void main(String[] args) {
		Client paulo = new Client();
		paulo.setName("Paulo Silveira");
		paulo.setCpf("222.222.222.-22");
		paulo.setProfissao("programmer");

		Account accountOfPaulo = new Account(6646,969060);
		accountOfPaulo.toDeposit(100);

		accountOfPaulo.setOwner(paulo);
		System.out.println(accountOfPaulo.getOwner().getName());
		System.out.println(accountOfPaulo.getOwner());

	}
}