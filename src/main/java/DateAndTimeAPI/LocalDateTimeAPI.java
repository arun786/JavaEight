package DateAndTimeAPI;

import java.time.LocalDateTime;

public class LocalDateTimeAPI {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        int y = localDateTime.getYear();
        int m = localDateTime.getMonthValue();
        int d = localDateTime.getDayOfMonth();

        System.out.println("Date and Time " + localDateTime);

        System.out.printf("%d:%d:%d", y, m, d);
        System.out.println();

        int h = localDateTime.getHour();
        int min = localDateTime.getMinute();
        int s = localDateTime.getSecond();
        int n = localDateTime.getNano();

        System.out.printf("%d:%d:%d:%d", h, min, s, n);
    }
}
