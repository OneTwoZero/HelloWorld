package com.itheima.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期和字符串的互转
 *
 * @author Small
 */
public class DateUtils {

    /**
     * 日期转换成字符串
     *
     * @param date
     * @param pattern 转换的格式
     * @return
     */
    public static String date2Str(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String dateStr = sdf.format(date);
        return dateStr;
    }

    /**
     * 字符串转日期
     *
     * @param dateStr
     * @param pattern
     * @return
     * @throws ParseException
     */
    public static Date str2Date(String dateStr, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = sdf.parse(dateStr);
        return date;
    }
}
