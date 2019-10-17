package section5;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1) {
            System.out.println("Invalid Value");
            return false;
        }
        int limit = number / 2;
        for (int f = 1; f <= limit; f++) {
            if ((number % f) == 0) {
                sum += f;
            }
        }
        if (sum == number) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}

