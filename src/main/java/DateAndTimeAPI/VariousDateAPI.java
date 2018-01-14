package DateAndTimeAPI;

import java.time.LocalDate;

public class VariousDateAPI {

    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);

        int dayOfMonth = todayDate.getDayOfMonth();
        System.out.println(dayOfMonth); //It gives the date of the month for the current date

        int month = todayDate.getMonthValue();
        System.out.println(month); //Month of the year for the current date

        int year = todayDate.getYear();
        System.out.println(year); //Year of current year for the current date

        System.out.printf("%d-%d-%d", dayOfMonth, month, year);
    }
}
