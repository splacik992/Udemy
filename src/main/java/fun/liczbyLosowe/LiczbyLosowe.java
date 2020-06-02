package fun.liczbyLosowe;

import java.util.Random;

public class LiczbyLosowe {
    public static void main(String[] args) {


        Random r = new Random();

        int a = r.nextInt();
        System.out.println(a);

        int b = r.nextInt(11);
        System.out.println(b);

        int c = r.nextInt(10) + 1;
        System.out.println(c);

        float e = r.nextFloat();
        System.out.println(e);

        double k = r.nextDouble();
        System.out.println(k);

        boolean g = r.nextBoolean();
        System.out.println(g);
    }

}
