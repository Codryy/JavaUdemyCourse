public class Main {
    public static void main(String[] args) {
        int number1 = 15, number2 = 55;
        System.out.println("The numbers " + number1 + " and " + number2 + " share a digit? " + SharedDigit.hasSharedDigit(number1, number2));
    }
}

 // My solution ( works for numbers greater than 99 though)
public class SharedDigit {

//    public static boolean hasSharedDigit(int number1, int number2) {
//        if ( (number1<10 || number1 > 99) || (number2 < 10 || number2 > 99) ) {
//            return false;
//        }
//
//        int number1a,number2b;
//        boolean a = false;
//        while(number1 > 0){
//            number1a = number1 % 10;
//            number2b = number2;
//            while(number2b > 0){
//                if (number2b % 10 == number1a) {
//                    a = true;
//                } else {
//                    number2b /= 10;
//                }
//                if (a){
//                    break;
//                }
//            }
//            number1 /= 10;
//        }
//        return a;
//    }
//}

    // Another user's solution ( works only for numbers between 10 and 99 inclusive )
    public static boolean hasSharedDigit(int x, int y) {
        if ((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
            return false;
        } else {
            return ((x / 10 == y / 10) || (x / 10 == y % 10) || (y / 10 == x % 10) || (x % 10 == y % 10));
        }
    }
}
