package PDF11EVISI1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Evisi2 {
    public static void main(String[] args) {
        //11
        LocalDate localDate1 = LocalDate.parse("2020-12-12");
        LocalDate localDate2 =LocalDate.parse("2023-12-12");
        boolean first = localDate1.isBefore(localDate2);
        System.out.println(first);

        //14
        LocalDate localDate3 = LocalDate.parse("2023-03-07");
        LocalDate localDate4 = LocalDate.parse("2022-05-05");
        int value1 = localDate3.getDayOfMonth() - localDate4.getDayOfMonth();
        System.out.println(value1);

        //16
        LocalDateTime dateTime = LocalDateTime.parse("2023-07-09 10:20:30");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String  value2 = dateTime.format(dateTimeFormatter);
        System.out.println(value2);

        //17
        String dateTime2 = "2023-05-24 14:50:30";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime5 = LocalDateTime.parse(dateTime2,dateTimeFormatter1);
        System.out.println(localDateTime5);

        //18

    }
}
