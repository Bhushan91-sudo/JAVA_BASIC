/**
 * Java LocalTime class is an immutable class that represents time with a default format of hour-minute-second.
 *  It inherits Object class and implements the Comparable interface.
 */
package LocalTime_Class;
import java.time.LocalTime;
public class LocalTimeExp1 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
    
}
