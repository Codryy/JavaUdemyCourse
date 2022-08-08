import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count value: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // takes care of input ( enter key )
        int[] array = readIntegers(count);

//        long startTime = System.currentTimeMillis();

        int min = findMin(array);

//        long endTime = System.currentTimeMillis();
//        System.out.println("Total execution time is: " + (endTime-startTime) + " milliseconds.");*/

        System.out.println("The minimum value from the array is: " + min);
    }
    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for ( int i = 0; i < array.length; i++) {
            System.out.print("Enter value " + (i+1) + " : ");
            array[i] = scanner.nextInt();
            scanner.nextLine(); // takes care of input ( enter key )
        }
        scanner.close();
        return array;
    }
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for ( int i = 0; i < array.length; i++) {
            if ( array[i] < min ) min = array[i];
        }
        return min;
    }
}
