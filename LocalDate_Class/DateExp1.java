/**
 * Program to demonstrate methods of LocalDate class such as now(), minusDays(), plusDays().
 * Java LocalDate class is an immutable class that represents Date with a default format of yyyy-mm-dd.
 *  It inherits Object class and implements the ChronoLocalDate interface
 */

package LocalDate_Class;
import java.time.LocalDate;

public class DateExp1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow  = yesterday.plusDays(2);
        System.out.println("Today date: " + date);
        System.out.println("Yesterday date: " + yesterday);
        System.out.println("Tomorrow date: " + tomorrow);
    }
    
}
