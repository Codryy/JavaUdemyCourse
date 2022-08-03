public class Main {
    public static void main(String[] args) {
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
    }
}

public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c){
        if ( (a+b) == c) return true;
        else return false;
    }
}
