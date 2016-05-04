package top.weeklybuy.www.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zxnui on 16-5-3.
 */
public class DateUtil {

    /**
     * string时间转换为timestamp
     * @param timeStr   具体时间
     * @param pattern   时间格式
     * @return  转换后的时间
     */
    public static Timestamp StringToDate(String timeStr, String pattern) throws Exception {
        DateFormat df = new SimpleDateFormat(pattern);
        Date date = df.parse(timeStr);
        return new Timestamp(date.getTime());
    }

    /**
     * 时间转换为String
     * @param date      具体时间
     * @param pattern   时间格式
     * @return  转换后的string
     */
    public static String DateToString(Date date, String pattern) {
        DateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }
}
