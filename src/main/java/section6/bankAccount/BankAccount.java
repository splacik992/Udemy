package section6.bankAccount;

public class BankAccount {

    private String accountNumber;
    private int balance;
    private String clientName;
    private String clientEmail;
    private String phoneNumber;


    public BankAccount() {
    }

    public BankAccount(String accountNumber, int balance, String clientName, String clientEmail, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String clientName, String clientEmail, String phoneNumber) {
        this("999",100,clientName,clientEmail,phoneNumber);
    }

    public void addBalance(int value) {
        this.balance += value;
        System.out.println("Wplacasz " + value + " / Nowy stan konta wynosi: " + this.balance);
    }

    public void withdrawMoney(int value) {
        if (this.balance - value < 0) {
            System.out.println("Za malo kasy na koncie!");
        } else {
            this.balance -= value;
            System.out.println("Wyplata w toku  = " + value + "zl / Na koncie zostalo: " + this.balance);
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
