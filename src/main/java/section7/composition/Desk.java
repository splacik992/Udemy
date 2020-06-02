package section7.composition;

public class Desk {

    private String colour;
    private int legs;
    private double height;

    public Desk(String colour, int legs, double height) {
        this.colour = colour;
        this.legs = legs;
        this.height = height;
    }


    public void make(){
        System.out.println("Desk - > Making");
    }

    public String getColour() {
        return colour;
    }

    public int getLegs() {
        return legs;
    }

    public double getHeight() {
        return height;
    }
}
