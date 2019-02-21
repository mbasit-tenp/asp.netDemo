package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by eliya on 1/8/18.
 */
public class DateTime {

    Date today = new Date();
    Calendar cal = new GregorianCalendar();

    public String Get_DateTime() {
        cal.setTime(today);
        Date timestamp = cal.getTime();
        String date = String.valueOf(new SimpleDateFormat("yyyyMMddHHmmss").format(timestamp));
        return date;
    }

    public String Get_Date() {
        cal.setTime(today);
        Date timestamp = cal.getTime();
        String date = String.valueOf(new SimpleDateFormat("yyyyMMdd").format(timestamp));
        return date;
    }
}

