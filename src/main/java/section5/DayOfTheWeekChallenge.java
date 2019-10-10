package section5;

public class DayOfTheWeekChallenge {

    public static void printDayOfTheWeek(int day){

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    public static void main(String[] args) {
        printDayOfTheWeek(1);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(3);
        printDayOfTheWeek(5);
    }
}
