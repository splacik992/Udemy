package section5;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number > 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        int count = 0;

        if (start < 0 || end < start) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                    count++;
                }else{
                    count++;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 2));
    }
}
