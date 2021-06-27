import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
//import java.time.Month;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the date: ");
        System.out.print("The desired year: ");
        int yyyy = in.nextInt();
        System.out.print("The desired month: ");
        int mm = in.nextInt();
        System.out.print("The desired day: ");
        int dd = in.nextInt();
        

        LocalDate localDate = LocalDate.of(yyyy, mm, dd);
        
        String fullDate = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("FULL format: " + fullDate);
        
        var dayOfWeek = DayOfWeek.from(localDate);
        String formattedDate = localDate.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
        System.out.println("Full date: " + dayOfWeek + " " + formattedDate);

        in.close();



    }
    
}
