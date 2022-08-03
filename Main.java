public class Main {

    public static void main(String[] args) {

        SortedArray sortedArray = new SortedArray();

        int [] array = sortedArray.getIntegers(5);

        sortedArray.sortIntegers(array);

        sortedArray.printArray(array);
    }

}
