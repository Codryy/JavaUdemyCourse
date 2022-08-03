public class Main {

    public static void main(String[] args) {

        SortedArray sortedArray = new SortedArray();

        int [] array = sortedArray.getIntegers(5);

        sortedArray.sortIntegers(array);

        sortedArray.printArray(array);
    }

}

import java.util.Scanner;

public class SortedArray {


    public static int[] getIntegers(int size) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        for ( int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int interchange = 0;
        for ( int i = 0; i < array.length; i++) {
            for ( int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    interchange = array[j];
                    array[j] = array[i];
                    array[i] = interchange;
                }
            }
        }
        return array;
    }

}
