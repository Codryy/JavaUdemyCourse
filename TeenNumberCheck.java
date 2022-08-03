public class Main {
    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
    }
}

public class TeenNumberChecker {
    public static boolean hasTeen(int nr1, int nr2, int nr3){
        return isTeen(nr1) || isTeen(nr2) || isTeen(nr3);
    }

    public static boolean isTeen(int nr1){
        return (nr1 >= 13 && nr1 <= 19);
    }
}
