package section5;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int first = number % 10;
        if (number < 0) {
            System.out.println("Negative number!");
        }
        while (number >= 10) {
            number = number / 10;
        }
        return first + number;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2543)) ;
        System.out.println(sumFirstAndLastDigit(-532)) ;
    }
}

