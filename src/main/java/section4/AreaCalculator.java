package section4;

public class AreaCalculator {

    public static double area(double radius){
        if(radius < 0)
            return -1.0;
        return 3.14*(radius*radius);
    }

    public static double area(double a, double b){
        if(a<0 || b<0)
            return -1.0;
        return a*b;
    }


    public static void main(String[] args) {

        System.out.println(area(5.0) + " - is circle area");
        System.out.println(area(5.0,4.0) + " - is rectangle area");

    }
}
