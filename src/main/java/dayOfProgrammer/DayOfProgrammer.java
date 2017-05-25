package dayOfProgrammer;

public class DayOfProgrammer {
    public static final String nonLeapYearDayOfProgramerAfter1918 = "13.09.";
    public static final String leapYearDayOfProgramerAfter1918 = "12.09.";
    public static final String year1918 = "26.09.1918";

    private int year;

    public DayOfProgrammer(int year) {
        this.year = year;
    }

    public String getDate() {
        if(year == 1918){
            return  year1918;
        }
        if (isLeapYear()) {
            return leapYearDayOfProgramerAfter1918 + year;
        }
        return nonLeapYearDayOfProgramerAfter1918 + year;
    }

    public boolean isLeapYear() {

        if(year % 4 != 0){
            return false;
        }
        if(year % 100 !=0){
            return true;
        }
        if(year % 400 !=0){
            return false;
        }

        return true;
    }

}
