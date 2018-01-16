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
