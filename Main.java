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

    // My solution
    /*public static void getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds <0 || seconds > 59){
            System.out.println("Invalid value");;
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
            System.out.println("Invalid value");
        } else {
            int minutes = seconds / 60;
            int remainderSeconds = seconds % 60;
            getDurationString(minutes, remainderSeconds);
        }
    }*/

    //Tim's solution
    private static String getDurationString(long minutes, long seconds){
        if( (minutes < 0) || (seconds < 0) || (seconds > 59) ) {
            return INVALID_VALUE_MESSAGE;
        } else {

            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hoursString = hours + "h ";
            if ( hours < 10 ) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m ";
            if ( remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s ";
            if ( seconds < 10 ) {
                secondsString = "0" + secondsString;
            }

            return hoursString + minutesString + secondsString;
        }
    }

    private static String getDurationString(long seconds){
        if ( seconds < 0 ) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}

