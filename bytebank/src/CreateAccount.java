public class CreateAccount {

    public static void main(String[] args) {
        Account firstAccount = new Account(6646,969060);
        firstAccount.toDeposit(200);
        System.out.println(firstAccount.getBalance());

        firstAccount.toDeposit(100);
        System.out.println(firstAccount.getBalance());

        Account secondAccount = new Account(6645,969061);
        secondAccount.toDeposit(50);

        System.out.println("The first account has " + firstAccount.getBalance() + " dollars");
        System.out.println("The second account ha " + secondAccount.getBalance() + " dollars");
        System.out.println();

        //showing different memory addresses
        System.out.println("Referencing to: " + firstAccount);
        System.out.println("Referencing to: " + secondAccount);
    }

}