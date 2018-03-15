package bigdata.uitools.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by ASUS on 2017-08-05.
 */
public class DateUtils {

    /**
     * 时间转换为字符串
     * @param date 时间
     * @return 时间字符串
     */
    public static String dateToString(Date date){
        String formatStr = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(date);
    }

    /**
     * 时间转换为字符串
     * @param date 时间
     * @param formatStr 转换格式
     * @return 时间字符串
     */
    public static String dateToString(Date date, String formatStr){
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(date);
    }

    /**
     * 字符串转换为时间
     * @param date 时间字符串
     * @return 时间
     */
    public static Date stringToDate(String date){
        String formatStr = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        try {
            Date resultDate = sdf.parse(date);
            return resultDate;
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 字符串转换为时间
     * @param date 时间字符串
     * @return 时间
     */
    public static Date stringToDate(String date, String formatStr){
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        try {
            Date resultDate = sdf.parse(date);
            return resultDate;
        }catch (Exception e){
            return null;
        }
    }

    /**
     * 比较日期1是否小于日期2
     * @param d1
     * @param d2
     * @return 1 < 2 true
     */
    public static boolean compareDay(Date d1, Date d2) {
        return(d1.getTime() < d2.getTime());
    }



    /**
     * 时间增加
     * @param date 时间
     * @param scale 增加类型（分，小时，天，月）
     * @param timeLength 增加量
     * @return
     */
    public static Date addDate(Date date,String scale,int timeLength){
        if(timeLength == 0){
            return date;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int calType = 0;
        switch(scale){
            case "I":
                calType = Calendar.MINUTE;
                break;
            case "H":
                calType = Calendar.HOUR;
                break;
            case "D":
                calType = Calendar.DATE;
                break;
            case "M":
                calType = Calendar.MONTH;
                break;
            default:
                break;
        }
        cal.add(calType, timeLength);
        return cal.getTime();
    }
}
