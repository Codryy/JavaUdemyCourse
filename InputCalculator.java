public class Main {
    public static void main(String[] args) {
        InputCalculator.inputThenPrintSumAndAverage();
    }
}

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0, cnt=0;
        long average;
        while(true){

            System.out.println("Enter a number: ");

            boolean isValidNumber = scanner.hasNextInt();
            if(isValidNumber){
                int number = scanner.nextInt();
                sum += number;
                cnt += 1;
            } else {
                break;
            }
        }

        if(sum==0){
            sum=0;
            average = 0;
        } else{
            average = Math.round((double) sum/cnt);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
