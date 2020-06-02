package section7.BillsBurgerMasterChallenge;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Wiejski","biały","wolowina",4.5);
        double price = hamburger.itemizeHamburger();
        hamburger.addAddition1("tomato", 0.75);
        hamburger.addAddition2("cucumber", 0.22);
        hamburger.addAddition3("letuce", 1.42);

        System.out.println("Total price for burger is " + hamburger.itemizeHamburger());

        System.out.println("---------------------------");
        HealthyBurger healthyBurger = new HealthyBurger("Egg" , 4.5);
        healthyBurger.addHealthyAddition1("banana", 1.32);
        healthyBurger.itemizeHamburger();
    }




}
