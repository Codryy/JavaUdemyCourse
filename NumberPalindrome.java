public class Main {
    public static void main(String[] args) {
        int number = -1221;
        System.out.println("The number " + number + " is palindrome? " + NumberPalindrome.isPalindrome(number) );
    }
}

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reversedNumber = 0;
        if(number < 0) {
            number *= -1;
        }
        int number1= number;
        while (number1 > 0) {
            reversedNumber = (reversedNumber * 10) + (number1 % 10);
            number1 /= 10;
        }
        return (number == reversedNumber) ? true : false;
    }
}
