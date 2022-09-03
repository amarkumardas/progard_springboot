import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.firstInMonth;
import static java.time.temporal.TemporalAdjusters.lastInMonth;

/*Write a method that returns the last Sunday of each month for a given year.
        Example
        last_sunday(2013)
        2013-01-27
        2013-02-24
        2013-03-31
        2013-04-28
        2013-05-26
        2013-06-30
        2013-07-28
        2013-08-25
        2013-09-29
        2013-10-27
        2013-11-24
        2013-12-29
        Hint
        If you input the year 2020, a leap year, is the last Sunday of February 2020-02-23?
        If you input the year 2032, also a leap year, is the last Sunday February 2032-02-29
*/
public class Dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year= sc.nextInt();

        String str[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY",
                "JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
       for(int i=0;i<12;i++) {
           LocalDate now = LocalDate.of(year, Month.valueOf(str[i]), 1);
           LocalDate sunday = now.with(lastInMonth(DayOfWeek.SUNDAY));
           System.out.println(sunday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
       }
    }
}
