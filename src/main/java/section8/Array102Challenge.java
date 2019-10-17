package section8;

import java.util.Arrays;
import java.util.Scanner;

public class Array102Challenge {



    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Podaj wielkosc tabeli");
        int number = scanner.nextInt();
        int[]numberArray = readIntegers(number);
        for (int i = 0; i <numberArray.length ; i++) {
            System.out.println(numberArray[i]);
        }
        System.out.println("Najniższa wartosc =  " + findMin(numberArray));



    }

    public static int [] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Podaj wartosc indexu : " + i);
            array[i]= scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int[] minArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < minArray.length - 1; i++) {
                if (minArray[i] > minArray[i + 1]) {
                    temp = minArray[i];
                    minArray[i] = minArray[i + 1];
                    minArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return minArray[0];
    }
}
