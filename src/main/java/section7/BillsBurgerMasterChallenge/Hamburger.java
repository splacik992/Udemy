package section7.BillsBurgerMasterChallenge;

public class Hamburger {


    private String nameOfBread;
    private String nameOfMeat;
    private double price;
    private String name;

    private double addition1Prize;
    private double addition2Prize;
    private double addition3Prize;
    private double addition4Prize;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;

    public void addAddition1(String name, double price) {
        this.addition1 = name;
        this.addition1Prize = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2 = name;
        this.addition2Prize = price;
    }

    public void addAddition3(String name, double price) {
        this.addition3 = name;
        this.addition3Prize = price;
    }

    public void addAddition4(String name, double price) {
        this.addition4 = name;
        this.addition4Prize = price;
    }

    public Hamburger(String name, String nameOfBread, String nameOfMeat, double price) {
        this.nameOfBread = nameOfBread;
        this.nameOfMeat = nameOfMeat;
        this.price = price;
        this.name = name;
    }

    public double itemizeHamburger() {
        double additionPrize = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.nameOfBread +
                " roll " + "price is " + this.price);
        if (addition1 != null) {
            additionPrize += this.addition1Prize;
            System.out.println("Added " + this.addition1 + " for an extra " + this.addition1Prize);
        }
        if (addition2 != null) {
            additionPrize += this.addition2Prize;
            System.out.println("Added " + this.addition2 + " for an extra " + this.addition2Prize);
        }
        if (addition3 != null) {
            additionPrize += this.addition3Prize;
            System.out.println("Added " + this.addition3 + " for an extra " + this.addition3Prize);
        }
        if (addition4 != null) {
            additionPrize += this.addition4Prize;
            System.out.println("Added " + this.addition4 + " for an extra " + this.addition4Prize);
        }
        return additionPrize;
    }

//    Celem aplikacji jest pomoc fikcyjnej firmie Bills Burgers w zarządzaniu procesem sprzedaży hamburgerów.
//        Nasza aplikacja pomoże Billowi wybrać rodzaje hamburgerów, niektóre dodatkowe elementy (dodatki), które zostaną dodane do
// hamburgerów i ceny. Chcemy stworzyć bazowego hamburgera, ale także dwa inne rodzaje hamburgerów, które są popularne w sklepie Bills.
//                    // Podstawowy hamburger powinien zawierać następujące elementy.
//                    // Rodzaj bułki, mięso i do 4 dodatkowych dodatków (sałata, pomidor, marchew, itp.), Które klient może wybrać
//            do dodania do burgera.
//                    // Za każdy z tych przedmiotów naliczana jest dodatkowa cena, dlatego potrzebujesz sposobu na śledzenie liczby
//            dodanych przedmiotów i obliczenie ceny końcowej (burger podstawowy ze wszystkimi dodatkami).
//              Ten burger ma cenę podstawową, a wszystkie dodatki są osobno wycenione (do 4 dodatków, patrz wyżej).
//                   Utwórz klasę Hamburger, aby poradzić sobie z powyższymi zagadnieniami.
//                    = Konstruktor powinien podać tylko typ bułki, mięso i cenę, może także zawierać nazwę burgera lub możesz użyć
//            setera.
//                    // Stwórz także dwie dodatkowe odmiany hamburgerów (podklasy)
//                    a) Zdrowy burger (na brązowej bułce żytniej) oraz dwa dodatkowe elementy, które można dodać.
//                   Zdrowy burger może mieć łącznie 6 pozycji (dodatków).
//                    wskazówka: prawdopodobnie chcesz przetworzyć dwa dodatkowe elementy w tej nowej klasie (podklasa Hamburgera),
//            a nie w klasie podstawowej (Hamburger), ponieważ dwa dodatki są odpowiednie tylko dla tej nowej klasy
//            (innymi słowy nowy typ burgera).
//                    b) Hamburger Deluxe - jest dostarczany z frytkami i napojami jako dodatkami, ale dodatkowe dodatki nie są dozwolone.
//        wskazówka: Musisz znaleźć sposób, aby automatycznie dodawać te nowe dodatki w momencie tworzenia luksusowego obiektu burger,
// a następnie zapobiegać dodawaniu innych dodatków.
//        // Wszystkie 3 klasy powinny mieć metodę, którą można wywołać w dowolnym momencie, aby pokazać cenę bazową hamburgera
//                // plus wszystkie dodatki, każdy z nazwą i ceną dodatku oraz suma końcowa / końcowa dla
//                // burger (cena podstawowa + wszystkie dodatki)
//                // Dla dwóch dodatkowych klas może to wymagać spojrzenia na klasę bazową w celu ustalenia ceny, a następnie
//                // dodanie sum do ceny końcowej.
}
