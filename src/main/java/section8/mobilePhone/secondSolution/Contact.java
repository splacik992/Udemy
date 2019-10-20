package section8.mobilePhone.secondSolution;

public class Contact {

    String name;
    String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public static Contact addContact(String name, String number){
        return new Contact(name,number);
    }
}
