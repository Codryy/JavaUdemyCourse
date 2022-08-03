public class Main {
    public static void main(String[] args) {
        int number = 33550336;
        System.out.println(PerfectNumber.isPerfectNumber(number));
    }
}

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }
        int sum=0;
        for (int i=1; i<= number/2; i++)
            if(number % i == 0) sum += i;
        return sum == number;
    }
}
