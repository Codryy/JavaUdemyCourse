public class Main {
    public static void main(String[] args) {
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));
        System.out.println(LastDigitChecker.isValid(19));
        System.out.println(LastDigitChecker.isValid(468));
        System.out.println(LastDigitChecker.isValid(1051));
    }
}

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if( (number1 < 10 || number1 > 1000) || (number2 < 10 || number2 > 1000) || (number3 < 10 || number3 > 1000) ) {
            return false;
        }
        return ( (number1 % 10 == number2 % 10) || (number1 % 10 == number3 % 10) || (number2 % 10 == number3 % 10) ) ? true : false;
    }

    public static boolean isValid(int number) {
        return ( (number < 10 || number > 1000) ) ? false : true;
    }
}
