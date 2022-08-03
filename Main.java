import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers();
        printArray(myArray);
        sortIntegers(myArray);
        printArray(myArray);
    }

    public static int[] getIntegers() {
        int[] array = new int[5];
        System.out.println("Please enter 5 integer numbers.");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " has the value: " + array[i]);
        }
        System.out.println("");
    }

    public static int[] sortIntegers(int[] array) {
        int interchange = 0;
        for (int i = 0; i < array.length; i++) {
            for ( int j = i+1; j < array.length; j++) {
                if ( array[j] > array[i] ) {
                    interchange = array[j];
                    array[j] = array[i];
                    array[i] = interchange;
                }
            }
        }
        return array;
    }
}
