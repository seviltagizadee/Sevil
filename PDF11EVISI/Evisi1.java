package PDF11EVISI1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Evisi1 {
    public static void main(String[] args) {
        //1
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //2
        java.util.Date utilPackageDate
                = new java.util.Date();

        java.sql.Date sqlPackageDate
                = new java.sql.Date(utilPackageDate.getTime());
        System.out.println(sqlPackageDate);
        //3
        LocalDate time = LocalDate.of(2022,05,18);
        System.out.println(time);

        //4
        LocalTime time2 = LocalTime.now();
        System.out.println(time2);

        //5
        LocalTime time3 = LocalTime.parse("10:50:30");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_TIME;
        String value = time3.format(dateTimeFormatter);
        System.out.println(value);

        //6
        LocalDateTime time4 = LocalDateTime.now();
        System.out.println(time4);

        //7
        LocalDate time5 = LocalDate.parse("2020-03-05");
        System.out.println(time5);

        //8
        String  value2 = time3.format(dateTimeFormatter);
        System.out.println(value2);

        //9
        LocalDate localDate = LocalDate.now();
        LocalDate value3 = localDate.plusDays(5);
        System.out.println(value3);

        //10
        LocalTime localTime = LocalTime.now();
        LocalTime value4 = localTime.minusHours(3);
        System.out.println(value4);
    }
}
