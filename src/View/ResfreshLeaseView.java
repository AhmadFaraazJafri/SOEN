package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ResfreshLeaseView {


    public Date getDate() {
        System.out.println("Enter current date: ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

        Scanner scanner = new Scanner(System.in);
        String stringDate = scanner.nextLine();
        Date date = null;
        try {
            date = dateFormat.parse(stringDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }


}
