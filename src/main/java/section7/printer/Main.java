package section7.printer;

public class Main {

    public static void main(String[] args) {


        Printer printer = new Printer(200,40,true);
        System.out.println("toner level is now " + printer.getTonerLevel() );
        printer.fillUpToner(20);

        printer.print(25);
        System.out.println("toner level is now " + printer.getTonerLevel());


        printer.fillUpToner(10);
        printer.fillUpToner(400);


    }
}
