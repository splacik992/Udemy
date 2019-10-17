package section8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescendingValues {

    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Podaj " + number + " liczb:");

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] print){
        for (int i = 0; i <print.length ; i++) {
            System.out.println(" " + print[i] + " ");
        }
    }

    public static int[] sortIntegers(int [] unsortedArray){
        int [] sortedArray = new int[unsortedArray.length];

        for (int i = 0; i <sortedArray.length ; i++) {
            sortedArray[i] = unsortedArray[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i <sortedArray.length-1 ; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray [i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }return sortedArray;
    }
    public static void main(String[] args) {

        int[] myInteger = getIntegers(5);
        printArray(sortIntegers(myInteger));
    }
//    public static void descendingArray() {
//        int arrayLength = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj rozmiar tabeli :");
//
//        arrayLength = scanner.nextInt();
//        int[] array = new int[arrayLength];
//        System.out.println("Podaj " + arrayLength + " liczb");
//        for (int i = 0; i < arrayLength; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            Arrays.sort(array);
//            for (int j = 0; j < array.length; j--) {
//                System.out.println(Arrays.toString(array));
//            }
//            System.out.println(array[i]);
//        }
//    }


}

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
