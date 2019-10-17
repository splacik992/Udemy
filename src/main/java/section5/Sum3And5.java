package section5;

public class Sum3And5 {


    public static void sum3and5() {
        for (int i = 1; i < 1000; i++) {
            int count = 1;
            if (count < 5) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " divisible by 5 and 3");
                }
            }
        }
    }
}


