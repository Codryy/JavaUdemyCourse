public class Main {
    public static void main(String[] args) {
        System.out.println("getDigitCount method tests:");
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println("");
        System.out.println("reverse method tests:");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));
        System.out.println("");
        System.out.println("numberToWords method tests:");
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
    }
}

public class NumberToWords {
    public static void numberToWords(int number) {
        if ( number < 0 ) {
            System.out.println("Invalid Value");
        }
        int numberReversed = reverse(number);
        int digitCounter = getDigitCount(number);
        while(digitCounter > 0){
            switch( (numberReversed % 10) ){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            numberReversed /= 10;
            digitCounter --;
        }
    }

    public static int reverse(int number){
        int numberReverse = 0;
        while ( number != 0 ) {
            numberReverse = (numberReverse * 10) + (number % 10);
            number /= 10;
        }
        return numberReverse;
    }

    public static int getDigitCount(int number){
        int count=0;
        if(number == 0){
            return 1;
        }
        if(number < 0 ) {
            return -1;
        } else {
            while(number > 0){
                count ++;
                number /= 10;
            }
        }
        return count;
    }
}
