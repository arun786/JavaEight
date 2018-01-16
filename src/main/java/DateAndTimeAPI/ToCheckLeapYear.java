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
