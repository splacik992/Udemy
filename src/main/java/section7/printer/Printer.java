package section7.printer;

public class Printer {

    private int tonerLevel;
    private double pagesPrinted;
    private boolean duplexPrinter;


    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        if (tonerLevel <= 0) {
            System.out.println("toner level is 0");
        } else if (tonerLevel > 100) {
            this.tonerLevel = 100;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int value) {
        System.out.println("Printer -> filling up toner by " + value);
        if (this.tonerLevel + value > 100) {
            System.out.println("Maximum of toner level");
            this.tonerLevel = 100;
        } else
            this.tonerLevel += value;
        System.out.println("Toner level is now : " + this.tonerLevel);
    }

    public int print(int valueOfPages) {
        if (this.duplexPrinter) {
            System.out.println("duplex printer mode !");
            pagesPrinted /= 2;
        }
        System.out.println("Printer -> printing pages: " + valueOfPages);
        this.tonerLevel -= valueOfPages * 2;
        return (int) pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public double getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean getDuplexPrinter() {
        return duplexPrinter;
    }
}
