package sedction11.example;

import java.util.ArrayList;

public class Account {

    private String account;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.account = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public String getAccount() {
        return account;
    }

    public void deposit(int amount){
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println("Balance account now : " + this.balance);
        }else {
            System.out.println("Cannot deposit min nums");
        }
    }

    public void withdraw(int amount){
        int withdraw = -amount;
        if(amount > 0) {
            this.transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println(amount + " withdraw from account. Now balance is : "  + this.balance);
        }
    }

    public void getBalance(){
        this.balance = 0;

        for (int i : transactions) {
            System.out.println(this.balance += i);
        }
        System.out.println("Balance of your account is : " + this.balance);
    }
}
