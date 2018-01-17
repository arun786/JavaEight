package DateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedIdBasic {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone); //America/Phoenix

        ZonedDateTime date = ZonedDateTime.now(zone);
        System.out.println(date);

        ZoneId caluttaZone = ZoneId.of("Asia/Calcutta");
        System.out.println(caluttaZone);

        ZonedDateTime dateTime = ZonedDateTime.now(caluttaZone);
        System.out.println(dateTime);


    }
}
