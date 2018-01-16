# Date API

## LocalDate API

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

## LocalTime API

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

## LocalDateTimeAPI

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

## Custom data and Time API

    package DateAndTimeAPI;
    
    import java.time.LocalDateTime;
    import java.time.Month;
    
    public class LocalDateTimeAPISpecificTime {
    
        public static void main(String[] args) {
            LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 11, 9, 10);
            System.out.println(localDateTime);
    
            System.out.println(localDateTime.plusMonths(6));
            System.out.println(localDateTime.minusMonths(6));
        }
    }

## Period

    package DateAndTimeAPI;
    
    import java.time.LocalDate;
    import java.time.Period;
    
    public class UseOfPeriod {
    
        public static void main(String[] args) {
            LocalDate dateOfBirth = LocalDate.of(2015, 01, 11);
            LocalDate todayDate = LocalDate.now();
    
            /**
             * It computes period between 2 days
             */
            Period p = Period.between(dateOfBirth, todayDate);
            System.out.printf("Age till today %d years %d months %d days", p.getYears(), p.getMonths(), p.getDays());
        }
    }


## Year

    package DateAndTimeAPI;
    
    import java.io.IOException;
    import java.time.Year;
    import java.util.Scanner;
    
    public class ToCheckLeapYear {
        public static void main(String[] args) throws IOException {
            System.out.println("Please enter a year");
            Scanner scan = new Scanner(System.in);
            int year = scan.nextInt();
            Year y = Year.of(year);
            if (y.isLeap())
                System.out.printf("%d is a leap year ", year);
            else
                System.out.printf("%d is not a leap year", year);
        }
    }
