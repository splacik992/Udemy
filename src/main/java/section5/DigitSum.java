package section5;

public class DigitSum {


    public static int sumDigits(int number) {
        int count = 0;
        int sum = 0;
        if (number < 10) {
            return -1;
        } else
            for (int i = 10; i <= number; i++) {
                sum += i;
                count++;
            }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumDigits(13));
        System.out.println(sumDigits(8));
    }
}

