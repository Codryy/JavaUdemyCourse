public class Main {
    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kiloBytes + " KB = " + (kiloBytes/1024) + " MB and " + (kiloBytes-((kiloBytes/1024)*1024)) + " KB");
        }
    }
}
