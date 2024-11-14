package main;
import bank.BankAccount;

public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.accountNumber = 257521469;
        account.balance = 10235.22;
        account.accountHolder = "Johnny";

        System.out.println(account.accountNumber);
        System.out.println(account.balance);
        System.out.println(account.accountHolder);
    }
}
