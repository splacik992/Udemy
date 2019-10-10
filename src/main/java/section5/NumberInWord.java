package section5;

import java.util.Scanner;

public class NumberInWord {

    public static void numberInWord(int number){
        switch (number){
            case 1:
                System.out.println(number + " is ONE");
                break;
            case 2:
                System.out.println(number + " is TWO");
                break;
            case 3:
                System.out.println(number + " is THREE");
                break;
            case 4:
                System.out.println(number + " is FOUR");
                break;
            case 5:
                System.out.println(number + " is FIVE");
                break;
            case 6:
                System.out.println(number + " is SIX");
                break;
            case 7:
                System.out.println(number + " is SEVEN");
                break;
            case 8:
                System.out.println(number + " is EIGHT");
                break;
            case 9:
                System.out.println(number + " is NINE");
                break;
            case 0:
                System.out.println(number + " is ZERO");
                break;
            default:
                System.out.println("INVALID NUMBER");
                break;
        }
    }

    public static void main(String[] args) {

        numberInWord(1);
        numberInWord(5);
        numberInWord(3);
    }
}
