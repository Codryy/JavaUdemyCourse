public class Main {
    public static void main(String[] args) {
        int number = 4, finishNumber= 20, count = 0;

        while ( number <= finishNumber){
            if(count == 5) {
                break;
            }
            number ++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number " + number + " " + isEvenNumber(number));
        }
        System.out.println("The total even numbers found is " + count);
    }

    public static boolean isEvenNumber(int number){
        return (number % 2 == 0) ? true : false;
    }
}
