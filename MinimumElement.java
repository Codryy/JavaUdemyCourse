import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    }
}

public class MinimumElement {

    public static int readInteger() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter count: ");
        int integer = scanner1.nextInt();
        scanner1.nextLine(); // takes care of input ( enter key )
        scanner1.close();
        return integer;
    }

    public static int[] readElements(int integer) {
        Scanner scanner2 = new Scanner(System.in);
        int[] array = new int[integer];
        for ( int i = 0; i<array.length; i++) {
            System.out.println("Enter number " + (i+1) + " : ");
            array[i] = scanner2.nextInt();
            scanner2.nextLine();
        }
        scanner2.close();
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for ( int i = 1; i < array.length; i++) {
            if ( min > array[i] ) min = array[i];
        }
        return min;
    }
}
