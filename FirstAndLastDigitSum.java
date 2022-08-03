public class Main {
    public static void main(String[] args) {
        int number = 252;
        System.out.println("The First and Last Digit sum of the number " + number + " is: " + FirstLastDigitSum.sumFirstAndLastDigit(number));
    }
}

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if(number<0){
            return -1;
        }
        int sum = number % 10, firstDigit=0;
        while(number>0){
            firstDigit = number % 10;
            number /= 10;
        }
        return (sum += firstDigit);
    }
}
