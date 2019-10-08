package section4;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo){
        int firstInt = (int)(numOne * 1000);
        int secondInt = (int)(numTwo * 1000);

        return firstInt == secondInt;
    }

}