public class Main {
    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0,4.0));
        System.out.println(AreaCalculator.area(-1.0,4.0));
    }
}

/*
public class AreaCalculator {

    public static double area(double radius){
        if ( radius < 0 ) {
            return -1d;
        }else {
            double PI = Math.PI;
            double area = radius * radius * PI;
            return area;
        }
    }

    public static double area(double x, double y){
        if ( x < 0 || y < 0 ) {
            return -1d;
        } else {
            double area = x * y;
            return area;
        }
    }
}*/

public class AreaCalculator {
    public static double area(double radius) {
        return ( radius < 0 ) ? -1 : radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        return ( x < 0 || y < 0 ) ? -1 : x * y;
    }
}
