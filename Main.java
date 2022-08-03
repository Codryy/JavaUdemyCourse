import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int counterOfNumbers = 1;
        while(true){

            System.out.println("Enter number #" + counterOfNumbers + ": ");
            boolean isValidNumber = scanner.hasNextInt();

            if(isValidNumber){
                int number = scanner.nextInt();
                counterOfNumbers += 1;

                if( ( min == 0 ) && ( max == 0) ) {
                    min = number;
                    max = number;
                }

                if( number < min){
                    min = number;
                }

                if ( number > max ) {
                    max = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // takes care of input (enter key)
        }
        System.out.println("Minimum number is: " + min + " and maximum number is: " + max);
        scanner.close();
    }
}
