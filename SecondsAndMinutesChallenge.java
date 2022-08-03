package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(125,40));
        System.out.println(getDurationString(7540));
        System.out.println(getDurationString(125, 5));
        System.out.println(getDurationString(7505));
        System.out.println(getDurationString(-41));
    }

    public static void getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds <0 || seconds > 59){
            System.out.println(INVALID_VALUE_MESSAGE);;
        } else {
            int hours = minutes/60;
            int remainderMinutes = minutes % 60;
            if(hours<10 && remainderMinutes < 10 && seconds < 10){
                System.out.println("0" + hours + "h " + "0" + remainderMinutes + "m " + "0" + seconds + "s ");
            } else if (hours<10 && remainderMinutes < 10){
                System.out.println("0" + hours + "h " + "0" + remainderMinutes + "m " + seconds + "s ");
            } else if (hours<10 && seconds < 10) {
                System.out.println("0" + hours + "h " + remainderMinutes + "m " + "0" + seconds + "s ");
            } else if (minutes<10 && seconds < 10) {
                System.out.println(hours + "h " + "0" + remainderMinutes + "m " + "0" + seconds + "s ");
            } else if (hours < 10) {
                System.out.println("0" + hours + "h " + remainderMinutes + "m " + seconds + "s ");
            } else if (minutes < 10) {
                System.out.println(hours + "h " + "0" + remainderMinutes + "m " + seconds + "s ");
            } else if (seconds < 10) {
                System.out.println(hours + "h " + remainderMinutes + "m " + "0" + seconds + "s ");
            }

        }
    }

    public static void getDurationString(int seconds){
        if(seconds < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            int minutes = seconds / 60;
            int remainderSeconds = seconds % 60;
            getDurationString(minutes, remainderSeconds);
        }
    }
