package section5;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word to see is palindrome or not :");
        String s = scanner.nextLine();
        isPalindromeWord(s);

        System.out.println("Enter number to see is palindrome or not :");
        int a = scanner.nextInt();
        scanner.nextLine();
        isPalindrome1(a);
    }

    public static void isPalindromeWord(String s) {
        String original = s;
        String reversed = "";


        int a = original.length();
        for (int i = a - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("Word is palindrome");
        } else {
            System.out.println("Word is not palindrome");
        }
    }

    public static void isPalindrome1(int number) {
        int reversed = 0;
        int newNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10;
            reversed += lastDigit;
            number = number / 10;
        }
        if (reversed == newNumber) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }
}

