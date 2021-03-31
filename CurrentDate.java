import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *@author Shorya created on 31 March 2021
 */
public class CurrentDate {
    public static void main(String[]args){
        //Used Date Time formatter to format the date
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        //Getting the Instance of local data time.
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(timeFormatter.format(dateTime));
    }
}
