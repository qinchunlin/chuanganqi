package android.com.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by zs
 * Date：2018年 09月 12日
 * Time：13:54
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */
public class Constant {
    public static String getTime() {
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));

        String year = String.valueOf(cal.get(Calendar.YEAR));
        String month = String.valueOf(cal.get(Calendar.MONTH) + 1);
        String day = String.valueOf(cal.get(Calendar.DATE));
        String hour = "";
        if (cal.get(Calendar.AM_PM) == 0)
            hour = String.valueOf(cal.get(Calendar.HOUR));
        else
            hour = String.valueOf(cal.get(Calendar.HOUR) + 12);
        String minute = "";
        if (cal.get(Calendar.MINUTE) < 10) {
            minute = "0" + String.valueOf(cal.get(Calendar.MINUTE));
        } else {
            minute = String.valueOf(cal.get(Calendar.MINUTE));
        }
        return year + "/" + month + "/" + day + " " + hour + ":" + minute;
    }

    public static String getCurrenTime() {
        Calendar calendar = Calendar.getInstance();

//获取系统的日期
//年
        int year = calendar.get(Calendar.YEAR);
//月
        int month = calendar.get(Calendar.MONTH) + 1;
//日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
//获取系统时间
//小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//分钟
        int minute = calendar.get(Calendar.MINUTE);
//秒
        int second = calendar.get(Calendar.SECOND);
        return year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second;
    }

    public static String getStartTime() {
        Calendar calendar = Calendar.getInstance();

//获取系统的日期
//年
        int year = calendar.get(Calendar.YEAR);
//月
        int month = calendar.get(Calendar.MONTH) + 1;
        int hourstart = month - 1;
//日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
//获取系统时间
//小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

//分钟
        int minute = calendar.get(Calendar.MINUTE);
//秒
        int second = calendar.get(Calendar.SECOND);
        return year + "-" + hourstart + "-" + day + " " + hour + ":" + minute + ":" + second;
    }

}
