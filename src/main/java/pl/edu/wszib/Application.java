package pl.edu.wszib;

import java.time.*;
import java.util.TimeZone;

public class Application {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();

        // Instant - reprezentuje konkretny "moment" (ilość sekund, która upłynęła od 1970)
        Instant instant = Instant.now(clock);
        // Period/Duration
        System.out.println("Instant: " + instant);
        Instant newPlus1s = instant.plusSeconds(1);
        System.out.println("Instant: " + newPlus1s);

        // LocalDate, LocalTime, LocalDateTime
        LocalDate localDate = LocalDate.now(clock);
        System.out.println("LocalDate: " + localDate);
        LocalTime localTime = LocalTime.now(clock);
        System.out.println("LocalTime: " + localTime);
        LocalDateTime localDateTime = localDate.atTime(localTime);
        System.out.println("LocalDateTime: " + localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.now(clock);
        // ISO 8601

        // OffsetDateTime
//        localDateTime.atOffset(ZoneId.systemDefault())
        OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
        System.out.println("OffsetDateTime: " + offsetDateTime);

        // ZonedDateTime
        ZonedDateTime zonedDateTime = offsetDateTime.toZonedDateTime();
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(clock);
        System.out.println("ZonedDateTime: " + zonedDateTime);
        System.out.println("ZonedDateTime: " + zonedDateTime1);

        // Period
        Period period = Period.of(1, 1, 1);
        System.out.println("Period: " + period);

        // Duration
        Duration duration = Duration.ofDays(1);
        System.out.println("Duration: " + duration);
        Duration duration1 = Duration.ofMinutes(1);
        System.out.println("Duration: " + duration1);
        Duration duration2 = Duration.ofSeconds(1);
        System.out.println("Duration: " + duration2);
        //Zad1
        System.out.println("Zad 1 \n" + localDateTime);
        System.out.println("Zad 2 \n" + ZonedDateTime.now(TimeZone.getTimeZone("America/New_York").toZoneId()));
        System.out.println("Zad 3");
        MonthInfo monthInfo = getFirstLastDay(LocalDate.now());
        System.out.println("First day of da month " + monthInfo.getFirstDay());
        System.out.println("Last day of da month " + monthInfo.getLastDay());
        System.out.println("Number of days of previous month " + monthInfo.getNoDaysInMonth().getDays());

    }

    public static MonthInfo getFirstLastDay(LocalDate time){
        time = time.minusMonths(1);
        LocalDate first = time.withDayOfMonth(1);
        LocalDate last = time.withDayOfMonth(time.getMonth().length(time.isLeapYear()));
        Period period = Period.between(first, last);
        period = period.plusDays(1);
        return new MonthInfo(first, last, period);
    }
}

