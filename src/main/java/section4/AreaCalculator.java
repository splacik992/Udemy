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


}
