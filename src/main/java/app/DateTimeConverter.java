package app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeConverter {
    public static void main(String[] args) throws ParseException {
        DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date date = utcFormat.parse("2022-12-22T07:41:29Z");

        DateFormat eetFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        eetFormat.setTimeZone(TimeZone.getTimeZone("EET"));

        System.out.println(eetFormat.format(date));
    }
}
