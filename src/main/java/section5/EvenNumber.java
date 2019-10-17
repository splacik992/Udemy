package section5;


public class EvenNumber {
    public static void main(String[] args) {

        int evenNumberFound = 0;
        int number = 0;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            evenNumberFound++;
            if (evenNumberFound >= 5) {
                break;
            }
            System.out.println("even number is " + number);
        }
        System.out.println(evenNumberFound + " - amount of even numbers");

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
