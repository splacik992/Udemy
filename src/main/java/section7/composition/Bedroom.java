package section6.composition;

public class Bedroom {

    private String name;
    private Walls wall1;
    private Walls wall2;
    private Walls wall3;
    private Walls wall4;
    private Bed bed;
    private Desk desk;
    private Computer laptop;

    public Bedroom(String name, Walls wall1, Walls wall2, Walls wall3, Walls wall4, Bed bed, Desk desk, Computer laptop) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.desk = desk;
        this.laptop = laptop;
    }

    public Bed getBed(){
        return this.bed;
    }

    public Computer getLaptop() {
        return laptop;
    }

    public Desk getDesk(){
        return this.desk;
    }

    public void makeDesk(){
        System.out.println("Beedroom -> Making desk");
        desk.make();

    }
}

