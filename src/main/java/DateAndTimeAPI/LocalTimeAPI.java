package DateAndTimeAPI;

import java.time.LocalTime;

public class LocalTimeAPI {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        int h = localTime.getHour();
        int m = localTime.getMinute();
        int s = localTime.getSecond();
        int n = localTime.getNano();

        System.out.printf("%d:%d:%d:%d", h, m, s, n);
    }
}
