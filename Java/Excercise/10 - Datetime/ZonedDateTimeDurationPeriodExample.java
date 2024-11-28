package DT;

import java.time.*;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.of(9, 0);
        LocalTime lt2 = LocalTime.of(17, 0);

        LocalDate ld1 = LocalDate.of(2023, 1, 1);
        LocalDate ld2 = LocalDate.of(2023,12,31);

        Duration duration = Duration.between(lt1, lt2);
        Period period = Period.between(ld1, ld2);

        System.out.println(duration);
        System.out.println(period);

    }
}
