package section6.bankAccount;

public class VipCustomer {

    private String name;
    private String email;
    private double creditLimit;


    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer() {
        this("deafult name", "default email" , 50000);
        System.out.println("Default constructor called");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,"unknownEmailAdress",50000);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
