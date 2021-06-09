import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private double savingsBalance;

    private static int numberOfAccounts = 0;
    private static double bankFunds = 0;

    public BankAccount() {
        this(0,0);
    }
    public BankAccount(double balance) {
        this(balance, 0);
    }

    public BankAccount(double balance, double savingsBalance) {
        this.accountNumber = generateAccountNumber();
        this.balance = balance;
        this.savingsBalance = savingsBalance;
        bankFunds += balance + savingsBalance;
        numberOfAccounts++;
    }

    private String generateAccountNumber() {
        List<Character> alphabetList = new ArrayList<>();
        Random r = new Random();
        String generatedAccountNumber = "";
    
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        for(char abc : alphabet) {
            alphabetList.add(abc);
        }
    
        Collections.shuffle(alphabetList);
        for(int i = 0; i < 10; i++) {
            generatedAccountNumber += alphabetList.get(r.nextInt(10));
        }
        return generatedAccountNumber;
    
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static double getBankFunds() {
        return bankFunds;
    }

    public void depositIntoAccount(double amount) {
        this.balance += amount;
        bankFunds += amount;
    }
    public void depositIntoSavings(double amount) {
        this.savingsBalance += amount;
        bankFunds += amount;
    }

    public void withdrawFromAccount(double amount) {
        if(this.balance < amount) System.out.println("Insufficient balance");
        else this.balance -= amount;
    }

    public void withdrawFromSavings(double amount) {
        if(this.savingsBalance < amount) System.out.println("Insufficient balance");
        else this.savingsBalance -= amount;
    }

    public void getTotalBalance() {
        System.out.println("account balance: "+ this.balance);
        System.out.println("savings account balance: "+ this.savingsBalance);
    }
    
}
