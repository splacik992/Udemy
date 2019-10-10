package section5;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999)
            return false;

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is a leap year (it has 366 days)");
            return true;
        } else System.out.println("The year is not a leap year (it has 365 days)");

        return false;
    }

    public static void main(String[] args) {
        isLeapYear(4535);
        isLeapYear(6232);
        isLeapYear(2000);
        isLeapYear(2001);
    }
}
