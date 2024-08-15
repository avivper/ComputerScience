package Gmar.Q11;

public class Year {

    public static final String[] DAYS_OF_WEEK = {
            "Saturday", "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday",
    };

    public static final int[] MONTHS =
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // היום בשבוע שבו חל 1 בינואר בשנה זו
    public static int newYear = 4;  // הכוונה ליום רביעי

    public static int daysOfMonth (int month) {
        return MONTHS[month-1];
    }

    /*
    השיטה מקבלת כפרמטרים את היום בחודש ואת מספר החודש ומחזירה את היום בשבוע שבו יחול תאריך זה
     */
    // todo: 31 of july, 1 of january and 5th of March
    public static String dayOfDate (int dayInMonth, int month) {
        int count = 0;
        for (int i = 0; i < month; i++) {
            count = count + MONTHS[i];
        }

        int day = count - daysOfMonth(month) + dayInMonth;

        for (int i = 0; i < count; i++) {
            if (i+1 == day) {
                return DAYS_OF_WEEK[newYear];
            }
            newYear++;
            if (newYear > 6) {
                newYear = 0;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        int x = daysOfMonth(2);
        String day = dayOfDate(7, 2);
        System.out.println(day);
    }
}
