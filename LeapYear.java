public class Main {
    public static void main(String[] args) {
        System.out.println(LeapYear.isYearLeap(-1600));
        System.out.println(LeapYear.isYearLeap(1600));
        System.out.println(LeapYear.isYearLeap(2017));
        System.out.println(LeapYear.isYearLeap(2000));
    }
}

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year <1 || year>9999){
            return false;
        } else {
            if ( (year % 4 == 0 && year  % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ){
                return true;
            } else return false;
        }
    }
}
