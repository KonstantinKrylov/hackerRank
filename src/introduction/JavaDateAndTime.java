package introduction;

import java.util.Calendar;
import java.util.Scanner;

public class JavaDateAndTime {
    /**
     * https://www.hackerrank.com/challenges/java-date-and-time/problem
     */

    public static String getDay(String day, String month, String year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        String[] days = new String[]{"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }

}
