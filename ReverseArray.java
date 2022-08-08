import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();

        int[] array = {1, 2, 3, 4, 5};

        reverseArray.reverse(array);
    }
}


public class ReverseArray {

    public static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int temp;
        for ( int i = 0; i < array.length/2 ; i++) {
            temp = array[i];
            array[i] = array[ (array.length-1-i) ];
            array[ (array.length-1-i) ] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
