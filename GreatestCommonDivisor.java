public class Main {
    public static void main(String[] args) {
        int first = 1010;
        int second = 10;
        System.out.println("Greatest Common Divisor between " + first + " and " + second + " is: " + GreatestCommonDivisor.getGreatestCommonDivisor(first, second));
    }
}

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if ( (first < 10) || (second < 10) ) return -1;
        int commonDivisor = 0;
        if( first > second) {
            for ( int i = 2; i <= second; i++){
                if( (first % i == 0) && (second % i == 0) ) {
                    commonDivisor = i;
                }
            }
        } else {
            for ( int i = 2; i <= first; i++){
                if( (first % i == 0) && (second % i == 0) ) {
                    commonDivisor = i;
                }
            }
        }
        return commonDivisor;
    }
}
