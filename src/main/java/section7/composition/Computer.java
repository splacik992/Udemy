package section7.composition;

public class Computer {

    private String name;
    private String color;


    public void turnOn(){
        System.out.println("Computer -> Turning on");
    }

    public Computer(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
