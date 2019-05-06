public class TestAccountWithoutClient {
	public static void main(String[] args) {
		Account AccountOfAnna = new Account(6646,969060);
		System.out.println(AccountOfAnna.getBalance());

		AccountOfAnna.setOwner(new Client());
		System.out.println(AccountOfAnna.getOwner());

		AccountOfAnna.getOwner().setName("Anna");
		System.out.println(AccountOfAnna.getOwner().getName());

	}
}