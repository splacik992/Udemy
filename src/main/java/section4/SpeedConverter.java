package section4;

public class SpeedConverter {


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h");
        }

    }

    public static void main(String[] args) {
//Speed Converter ----------------------------------------------
        SpeedConverter speedConverter = new SpeedConverter();
        speedConverter.printConversion(100);


    }
}
