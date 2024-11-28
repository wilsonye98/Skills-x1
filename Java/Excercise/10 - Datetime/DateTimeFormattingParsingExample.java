package DT;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(dtf.format(ldt));
//
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM dd yyyy");

        LocalDate ld = LocalDate.parse("November 21 2023", dtf2);

        System.out.println(dtf.format(ld));
    }


}
