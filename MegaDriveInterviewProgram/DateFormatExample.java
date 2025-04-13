package MegaDriveInterviewProgram;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateFormatExample {
    public static void main(String[] args) {
        // Get the current date
        Date currentDate = new Date(0);

        // Define the formats
        SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy--MM-dd");

        // Format the date
        String formattedDate1 = format1.format(currentDate);
        String formattedDate2 = format2.format(currentDate);

        // Print the formatted dates
        System.out.println("Formatted Date (MM-dd-yyyy): " + formattedDate1);
        System.out.println("Formatted Date (yyyy--MM-dd): " + formattedDate2);
    }
}
