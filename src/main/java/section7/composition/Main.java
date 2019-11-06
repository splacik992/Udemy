package section6.composition;

import section6.wallArea.Wall;

public class Main {

    public static void main(String[] args) {
        Walls walls1 = new Walls("East");
        Walls walls2 = new Walls("West");
        Walls walls3 = new Walls("North");
        Walls walls4 = new Walls("South");

        Bed bed = new Bed("Modern","White",2,1);
        Computer computer = new Computer("laptop", "black");
        Desk desk = new Desk("black",4,0.60);


        Bedroom bedroom = new Bedroom("Rafal room",walls1,walls2,walls3,walls4,
                bed,desk,computer);

        bedroom.makeDesk();
        bedroom.getBed().make();
        bedroom.getLaptop().turnOn();

    }
}
