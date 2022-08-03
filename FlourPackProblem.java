public class Main {
    public static void main(String[] args) {
        System.out.println(FlourPacker.canPack(1,0,4));
        System.out.println(FlourPacker.canPack(1,0,5));
        System.out.println(FlourPacker.canPack(0,5,4));
        System.out.println(FlourPacker.canPack(2,2,11));
        System.out.println(FlourPacker.canPack(-3,2,12));
        System.out.println(FlourPacker.canPack(2,1,5));
        System.out.println(FlourPacker.canPack(5,3,25));
    }
}

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) { // #1 validation
            return false;
        }

        while (bigCount > 0 && goal >= 5) { // #2 subtract 5 from goal for each bigCount
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal; // #3 make sure enough smallCount to fill remaining goal
    }
}
