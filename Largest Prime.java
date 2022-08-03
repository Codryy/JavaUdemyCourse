public class Main {
    public static void main(String[] args) {
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));
    }
}

public class LargestPrime {

    public static int getLargestPrime(int number){

        if ( number < 2 ) return -1;

        int prime = 0;

        for ( int i = 2; i<= number; i++){
            if( number % i == 0){
                int verification =0;
                for ( int j =2; j<i; j++){
                    if (i % j == 0) {
                        verification ++;
                    }
                }
                if(verification == 0) {
                    prime = i;
                }
            }
        }
        return prime;
    }
}
