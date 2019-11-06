package section6;

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

    public static void main(String[] args) {

        BankAccount account = new BankAccount();


        System.out.println("Stan konta wynosi : " + account.getBalance());
        account.setBalance(1000);
        account.addBalance(25);
        account.withdrawMoney(55);


        BankAccount kontoMarcina = new BankAccount();

        kontoMarcina.setClientName("Marcin Waski");
        kontoMarcina.setAccountNumber("2532432");
        kontoMarcina.setClientEmail("Warian@wp.pl");

        kontoMarcina.withdrawMoney(200);


        System.out.println("---------------------------");

        BankAccount paliAccount = new BankAccount("9191191",1000,"Rafal Pali"
                ,"marcin@wp.pl","95435");

        System.out.println(paliAccount.getClientName() + ": name "  + paliAccount.getBalance() + ": balance ");
    }

    //    // Utwórz nową klasę dla konta bankowego
//         // Utwórz pola dla numeru konta, salda, nazwy klienta, adresu e-mail i numeru telefonu.
//         //
//         // Utwórz metody pobierające i ustawiające dla każdego pola
//         // Utwórz dwie dodatkowe metody
//         // 1. Aby umożliwić klientowi zdeponowanie środków (powinno to zwiększyć pole salda).
//         // 2. Aby umożliwić klientowi wypłatę środków. To powinno odjąć od pola bilansu,
//         // ale nie zezwalaj na zakończenie wypłaty, jeśli są to niewystarczające środki.
//         // Będziesz chciał utworzyć różne kody w klasie Main (ten stworzony przez IntelliJ) do
//         // sprawdź, czy kod działa.
//         // Dodaj trochę System.out.println w dwóch powyższych metodach.
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
