package section7.composition;

public class Bed {

    private String sheets;
    private String colour;
    private int pillows;
    private int quilt;

    public Bed(String sheets, String colour, int pillows, int quilt) {
        this.sheets = sheets;
        this.colour = colour;
        this.pillows = pillows;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("Bed -> Maiking bed");
    }

    public String getSheets() {
        return sheets;
    }

    public String getColour() {
        return colour;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }
}
