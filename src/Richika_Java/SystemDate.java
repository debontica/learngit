package Richika_Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Date;

public class SystemDate {
    public static void main(String s[])throws ParseException
    {

        //SimpleDateFormat dt1= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print(dt1.format(now));
    }
}
