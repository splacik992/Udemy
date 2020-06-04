package sedction11.example;

public class Main {

    public static void main(String[] args) {

        Account rafalAccount = new Account("Rafal Account");

        rafalAccount.deposit(100);
        rafalAccount.withdraw(40);
        rafalAccount.deposit(60);

        rafalAccount.getBalance();

    }
}
