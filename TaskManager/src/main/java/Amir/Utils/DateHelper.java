package Amir.Utils;
/**
 * вводит дату правильно
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateHelper {
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

    public static String dateFormat(LocalDateTime localDateTime){
        return formatter.format(localDateTime);
    }
}
