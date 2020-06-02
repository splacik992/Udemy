package section6.bankAccount;

public class Main {

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


        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());

        VipCustomer vipCustomer1 = new VipCustomer("Rafal","marcin@wwp.pl",100000);
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getEmail());

        VipCustomer vipCustomer2 = new VipCustomer("Pawel", 40000);
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getEmail());
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



}
