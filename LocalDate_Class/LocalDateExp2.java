package LocalDate_Class;
import java.time.*;
public class LocalDateExp2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024,3,4);
        LocalDateTime datetime = date.atTime(11,6,10);
        System.out.println(datetime);
    }
    
}
