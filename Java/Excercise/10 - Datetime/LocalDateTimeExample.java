package DT;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
//        November 21 of 2023 at 6PM
        LocalDate ld = LocalDate.of(2023, 11, 21);
        LocalTime lt = LocalTime.of(18, 0);

//        LocalDateTime ldt = LocalDateTime.parse("2023-11-21T18:00");
        LocalDateTime ldt = LocalDateTime.of(2023,11,21,18,0);

        System.out.println(ldt);
    }
}
