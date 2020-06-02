package section7.BillsBurgerMasterChallenge;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String nameOfBread, String nameOfMeat, double price, String healthyExtra1Name,
                         double healthyExtra1price, String healthyExtra2Name, double healthyExtra2Price) {
        super(name, nameOfBread, nameOfMeat, price);
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1price = healthyExtra1price;
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public HealthyBurger(String nameOfMeat, double price) {
        super("Healthy", "Brown", nameOfMeat, price);

    }


    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1price = price;
    }public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
}
