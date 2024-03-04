package LocalTime_Class;
import java.time.LocalTime;
public class LocalTimeExp2 {
    public static void main(String[] args) {
    LocalTime time1 = LocalTime.of(11,25,15);
    System.out.println(time1);
    LocalTime time2 = time1.minusHours(2);
    LocalTime time3 = time2.minusMinutes(28);
    System.out.println(time3);
    
}
}
