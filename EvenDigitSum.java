public class Main {
    public static void main(String[] args) {
        int number = -22;
        System.out.println("The sum of the digits of number " + number + " is: " + EvenDigitSum.getEvenDigitSum(number));
    }
}

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while(number > 0){
            if( (number % 10) % 2 == 0){
                sum += (number % 10);
                number /= 10;
            } else {
                number /= 10;
            }
        }
        return sum;
    }
}
