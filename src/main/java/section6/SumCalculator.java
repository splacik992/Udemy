package section6;

public class SumCalculator {
    private double firstNumber;
    private double secondNumber;

//    private double getFirstNumber(){
//        return firstNumber;
//    }
//
//    public double getSecondNumber(){
//        return secondNumber;
//    }
//
//    public void setFirstNumber(double value){
//        this.firstNumber = value;
//    }
//
//    public void setSecondNumber(double value){
//        this.firstNumber = value;
//    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionNumber(){
        return firstNumber + secondNumber;
    }
    public double getSubNumber(){
        return firstNumber - secondNumber;
    }

    public double getMultipleResault(){
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionReturn(){

        return firstNumber/secondNumber;
    }

    public static void main(String[] args) {

        SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.setFirstNumber(10.0);
        sumCalculator.setSecondNumber(2.0);

        System.out.println("substraction = " + sumCalculator.getMultipleResault());
        System.out.println("add = " + sumCalculator.getAdditionNumber());
        System.out.println("division = " + sumCalculator.getDivisionReturn());

        sumCalculator.setSecondNumber(0.0);
        System.out.println("division by 0 = " + sumCalculator.getDivisionReturn());
    }
}
