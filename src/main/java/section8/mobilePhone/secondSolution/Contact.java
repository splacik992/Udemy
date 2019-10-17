package section8.mobilePhone.secondSolution;

public class Contact {

    String name;
    int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public static Contact addContact(String name, int number){
        return new Contact(name,number);
    }
}
