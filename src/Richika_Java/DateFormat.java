package Richika_Java;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String s[])throws ParseException
    {
        String date_1 = "01-06-2024";
        SimpleDateFormat dt1= new SimpleDateFormat("mm-dd-yyyy");
        Date date= dt1.parse(date_1);
        SimpleDateFormat dt2= new SimpleDateFormat("dd-mm-yyyy");
        System.out.print(dt2.format(date));
    }
}
