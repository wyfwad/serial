package com.wyf.serial.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateUtils {

    private static final String TIME14STRING = "yyyyMMddhhmmss";

    private static final String TIME14STRING2 = "yyyyMMddHHmmss";

    private static final String DATE6STRING = "yyMMdd";

    private static final String DATE8STRING = "yyyyMMdd";

    private static final String DATESTRING = "yyyy-mm-dd HH:mm:ss";

    public static final String now() {
        return now(14);
    }

    public static String now2() {
        return createDateFormat(TIME14STRING2).format(new Date()).toString();
    }

    public static String now(int len) {
        if (len == 14) {
            return createDateFormat(TIME14STRING).format(new Date()).toString();
        } else return new Date().toString();
    }

    // 获取当前时间
    public static Date getCurrentTime() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(DATESTRING);
        String dateString = formatter.format(currentTime);
        return parseDate(dateString, DATESTRING);
    }

    private static SimpleDateFormat createDateFormat(String fmt) {
        return new SimpleDateFormat(fmt);
    }

    public static String today() {
        return today(8);
    }

    public static String today(int len) {
        if (len == 6) {
            return createDateFormat(DATE6STRING).format(new Date()).toString();
        } else if (len == 8) {
            return createDateFormat(DATE8STRING).format(new Date()).toString();
        } else return createDateFormat(DATE8STRING).format(new Date()).toString();
    }

    public static Date parseDate(String timestr) {
        Date rd = null;
        try {
            rd = createDateFormat(DATE8STRING).parse(timestr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rd;
    }

    public static Date parseDateToDay(String timestr) {
        Date rd = null;
        SimpleDateFormat FORMATDATE = new SimpleDateFormat("yyyy-MM-dd");
        try {
            rd = FORMATDATE.parse(timestr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rd;
    }

    public static Date parseDateToTime(String timestr) {
        Date rd = null;
        SimpleDateFormat DATE2SECODE = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            rd = DATE2SECODE.parse(timestr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rd;
    }

    public static Date parseDate(String timestr, String pattern) {
        Date rd = null;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            rd = sdf.parse(timestr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rd;
    }

    public static String format2Date(Date date) {
        SimpleDateFormat DATE8 = new SimpleDateFormat("yyyyMMdd");
        return DATE8.format(date);
    }

    public static String format2Day(Date date) {
        SimpleDateFormat FORMATDATE = new SimpleDateFormat("yyyy-MM-dd");
        return FORMATDATE.format(date);
    }

    public static String format2Timestamp(Date date) {
        SimpleDateFormat TIME24 = new SimpleDateFormat("yyyyMMddHHmmss");
        return TIME24.format(date);
    }

    public static String format2Time(Date date) {
        SimpleDateFormat DATE2SECODE = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return DATE2SECODE.format(date);
    }

    public static String formatObjectDate(Object date) {
        SimpleDateFormat DATE19 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return DATE19.format(date);
    }

    public static String format2ObjectDate(Object date) {
        SimpleDateFormat FORMATDATE = new SimpleDateFormat("yyyy-MM-dd");
        return FORMATDATE.format(date);
    }

    public static String format3Timestamp(Date date) {
        SimpleDateFormat FORMATDATE = new SimpleDateFormat("yyyy-MM-dd");
        return FORMATDATE.format(date);
    }

    public static String formatMillisecond(Date date) {
        SimpleDateFormat MILLISECOND = new SimpleDateFormat("yyyyMMddHHmmssSS");
        return MILLISECOND.format(date);
    }

    public static String format2Month(Date date) {
        SimpleDateFormat FORMATDATE = new SimpleDateFormat("yyyyMM");
        return FORMATDATE.format(date);
    }

    /**
     * 将字符型日期转换为Date型日期
     * 
     * @param timestr
     * @return
     */
    public static Date parseToDate(String timestr) {
        Date rd = null;
        SimpleDateFormat DATE2SECODE = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            rd = DATE2SECODE.parse(timestr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rd;
    }

    public static Date getTheDate(Date date) {
        if (date == null) return null;
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);
        Calendar c2 = Calendar.getInstance();
        c2.set(c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DATE), 0, 0, 0);
        long millis = c2.getTimeInMillis();
        millis = millis - millis % 1000;
        c2.setTimeInMillis(millis);
        return c2.getTime();
    }

    public static Date parse(String pattern, String strDateTime) {
        Date date = null;
        if (strDateTime == null || pattern == null) return null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            formatter.setLenient(false);
            date = formatter.parse(strDateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Date skipDateTime(Date d, int skipDay) {
        if (d == null) return null;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.add(Calendar.DATE, skipDay);
        return calendar.getTime();
    }

    public static String formatDateTime(String pattern, Date date) {
        String strDate = null;
        String strFormat = pattern;
        SimpleDateFormat dateFormat = null;

        if (date == null) return "";

        dateFormat = new SimpleDateFormat(strFormat);
        strDate = dateFormat.format(date);

        return strDate;
    }

    /**
     * T+N
     *
     * @param timeStr
     * @param skipDay
     * @return
     */
    public static String skipDateTime(String timeStr, int skipDay) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        Date d = parse(pattern, timeStr);
        Date date = skipDateTime(d, skipDay);
        return formatDateTime(pattern, date);
    }

    /**
     * D+N
     *
     * @param dateStr
     * @param skipDay
     * @return
     */
    public static String skipDate(String dateStr, int skipDay) {
        String pattern = "yyyy-MM-dd";
        Date d = parse(pattern, dateStr);
        Date date = skipDateTime(d, skipDay);
        return formatDateTime(pattern, date);
    }

    /**
     * 日期比较
     *
     * @param str
     * @return
     */
    public static boolean dateCompare(String str) {
        boolean bea = false;
        SimpleDateFormat sdf_d = new SimpleDateFormat("yyyy-MM-dd");
        String isDate = sdf_d.format(new Date());
        Date date1;
        Date date0;
        try {
            date1 = sdf_d.parse(str);
            date0 = sdf_d.parse(isDate);
            if (date0.after(date1)) {
                bea = true;
            }
        } catch (ParseException e) {
            bea = false;
        }
        return bea;
    }

    /**
     * 得到当月第一天
     */
    public static String getFirstDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        return formatDateTime("yyyy-MM-dd", calendar.getTime());
    }

    /**
     * 判断指定的时间是否是当天
     * 
     * @param d
     *            指定的时间
     * @return true - 当前日期，false - 非当前日期
     */
    public static boolean isToday(Date d) {
        boolean b = false;

        Calendar today = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        c.setTime(d);

        if (today.get(Calendar.YEAR) == c.get(Calendar.YEAR) && today.get(Calendar.MONTH) == c.get(Calendar.MONTH)
            && today.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH)) b = true;

        return b;
    }

    /**
     * 判断指定日期是否是当前日期之前或者之后的某一天
     * 
     * @param d
     *            指定日期
     * @param days
     *            指定天数，负数表示之前的某一天，正数表示之后的某一天
     * @return true - 是当前日期，false - 非当前日期
     */
    public static boolean isToday(Date d, int days) {

        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DAY_OF_MONTH, days);
        return isToday(c.getTime());
    }

    /**
     * 获取当前日期前-days
     * 
     * @param date
     * @param days
     * @return
     */
    public static String getBeforeDate(Date date, int days) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - days);
        return df.format(calendar.getTime());
    }

    /**
     * 获取当前日期前-days
     * 
     * @param date
     * @param days
     * @return
     */
    public static String getBeforeDateStr(Date date, int days) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - days);
        return df.format(calendar.getTime());
    }

    /**
     * 获取当前日期+days
     * 
     * @param date
     * @param days
     * @return
     */
    public static String getAfterDate(Date date, int days) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + days);
        return df.format(calendar.getTime());
    }

    public static Date beforeOneHourToDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 1);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("一个小时前的时间：" + df.format(calendar.getTime()));
        System.out.println("传入的时间：" + df.format(date));
        return calendar.getTime();
    }

    public static boolean isThisMonth(String pattern, String time) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String param = sdf.format(new Date());// 参数时间
        if (time.equals(param)) {
            return true;
        } else return false;

    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat dateFormattercfm = new SimpleDateFormat("yyyyMMdd");
        System.out.println(DateUtils.getBeforeDate(dateFormattercfm.parse("20170216"), 0));
    }

    /**
     * 取得系统当前时间字符串.
     * 
     * @param type 类型
     * @return
     */
    public static String getCurrentSysTimeStr(int type) {

        Date dtNow = new Date(System.currentTimeMillis());

        String dateString = "";

        try {
            SimpleDateFormat formatter = null;
            switch (type) {
                case 1:
                    formatter = new SimpleDateFormat("yyyy.MM.dd");
                    break;
                case 2:
                    formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
                    break;
                case 3:
                    formatter = new SimpleDateFormat("yyyy.MM.dd hh:mm a");
                    break;
                case 4:
                    formatter = new SimpleDateFormat("yyyy-MM-dd");
                    break;
                case 5:
                    formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    break;
                case 6:
                    formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
                    break;
                case 7:
                    formatter = new SimpleDateFormat("yyyy-MM");
                    break;
                case 8:
                    formatter = new SimpleDateFormat("yyyyMMdd");
                    break;
                default:
                    formatter = new SimpleDateFormat("yyyy.MM.dd");
                    break;
            }
            dateString = formatter.format(dtNow);
        } catch (Exception e) {
            dateString = "";
        }
        return dateString;
    }

    /**
     * 按照指定的格式格式化时间.
     * 
     * @param date 时间
     * @param patern 格式
     * @return
     */
    public static String format(Date date, String patern) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat formater = new SimpleDateFormat(patern);
        return formater.format(date);
    }
}
