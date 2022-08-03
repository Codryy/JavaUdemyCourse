public class Main {
    public static void main(String[] args) {
        int number = 125;
        System.out.println("The sum of the digits of number " + number + " is: " + sumDigits(number));
        System.out.println("The sum of the digits of number " + 1 + " is: " + sumDigits(1));
        System.out.println("The sum of the digits of number " + -5 + " is: " + sumDigits(-5));
        System.out.println("The sum of the digits of number " + -125 + " is: " + sumDigits(-125));
        System.out.println("The sum of the digits of number " + 324156 + " is: " + sumDigits(324156));
    }

    public static int sumDigits(int number){
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while(number!=0){
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }
}
