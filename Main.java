import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{6, 1, 4, 2, 5, 3};
        System.out.println("Normal array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int intermediate;
        for ( int i = 0; i < array.length/2; i++) {
            intermediate = array[i];
            array[i] = array[ (array.length - i - 1) ];
            array[ (array.length - i - 1) ] = intermediate;
        }
    }
}
