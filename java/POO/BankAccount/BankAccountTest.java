public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(55.90);
        BankAccount bankAccount2 = new BankAccount(80.33, 77.8);

        System.out.println(bankAccount1.getAccountNumber());
        System.out.println(bankAccount2.getAccountNumber());
        System.out.println(BankAccount.getNumberOfAccounts());
        System.out.println(BankAccount.getBankFunds());

        bankAccount2.depositIntoAccount(55.55);
        bankAccount1.depositIntoSavings(88.0);

        System.out.println(BankAccount.getBankFunds());
        System.out.println(bankAccount1.getSavingsBalance());
        System.out.println(bankAccount2.getBalance());

        bankAccount1.withdrawFromSavings(100.0);
        bankAccount2.withdrawFromAccount(5);

        System.out.println(bankAccount2.getBalance());
        System.out.println("----acc1:---- ");
        bankAccount1.getTotalBalance();
        System.out.println("----acc2---- ");
        bankAccount2.getTotalBalance();
     
    }
}
