package section8;

import java.util.Arrays;

public class Reverse103Challenge {

    public static void reverse(int[]array){

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;

        for (int i = 0; i <halfLength ; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }

    public static void main(String[] args) {

       int [] test = {3,6,1,7,23,2};
        System.out.println("Tablica = " + Arrays.toString(test));
        reverse(test);
        System.out.println("Odwrocona tablica = " + Arrays.toString(test));
    }
}
