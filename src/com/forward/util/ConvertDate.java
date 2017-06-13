package com.forward.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ConvertDate {
	private static SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat datetime = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss");
    public static Date getNowDate(){
        return new Date();
    }
    // ****************************��ǰʱ�����****************************
    /**
     * ����� yyyy-MM-dd Ϊ��ʽ�ĵ�ǰʱ���ַ���
     * 
     * @return String
     */
    public static String getCurrentTimeByDay() {
        String time = date.format(new Date(System.currentTimeMillis()));
        return time;
    }

    /**
     * ����� yyyy-MM-dd HH:mm:ss Ϊ��ʽ�ĵ�ǰʱ���ַ���
     * 
     * @return String
     */
    public static String getCurrentTimeBySecond() {
        String time = datetime.format(new Date(System.currentTimeMillis()));
        return time;
    }

    /**
     * ��ø�����ʽ�ĵ�ǰʱ���ַ���
     * 
     * @param give
     *            String ������ʱ���ʽ
     * @return String
     */
    public static String getCurrentTime(String give) {
        SimpleDateFormat temp = new SimpleDateFormat(give);
        return temp.format(new Date(System.currentTimeMillis()));
    }

    // ****************************Stringת��ΪDate****************************
    /**
     * ��Stringת����date
     * 
     * @throws ParseException
     * */
    public static Date pStringToDate(String str, String sfgs)
            throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat(sfgs);
        return sf.parse(str);
    }

    /**
     * ��Stringת����date ��ʽΪyyyy-MM-dd hh:mm:ss
     * 
     * @throws ParseException
     * */
    public static Date pStringToDate(String str) throws ParseException {
        return datetime.parse(str);
    }

    // ****************************Dateת��ΪString****************************
    /**
     * ת�������ڸ�ʽ���ַ��� ��ʽΪyyyy-MM-dd
     * 
     * @param Object
     * @return String
     */
    public static String dateFormat(Date o) {
        if (o == null) {
            return "";
        }
        return date.format(o);
    }

    /**
     * ת����ʱ���ʽ���ַ��� ��ʽΪyyyy-MM-dd hh:mm:ss
     * 
     * @param Date
     * @return String
     */
    public static String dateTimeFormat(Date o) {
        if (o == null) {
            return "";
        }
        return datetime.format(o);
    }

    /**
     * ת���ɸ���ʱ���ʽ���ַ���
     * 
     * @param Date
     * @param String
     * @return String
     */
    public static String getDateFormat(Date d, String format) {
        return new SimpleDateFormat(format).format(d);
    }

    /**
     * ���ڸ�ʽ��(yyyy��MM��dd��)
     * 
     * @param Date
     * @return String
     * */
    public static String fDateCNYR(Date date) {
        return getDateFormat(date, "yyyy��MM��dd��");
    }

    /**
     * ���ڸ�ʽ��(yyyy��MM��dd�� HH:mm)
     * 
     * @param Date
     * @return String
     * */
    public static String fDateCNYRS(Date date) {
        return getDateFormat(date, "yyyy��MM��dd�� HH��");
    }

    /**
     * ���ڸ�ʽ��(yyyy��MM��dd�� HH:mm)
     * 
     * @param Date
     * @return String
     * */
    public static String fDateCNYRSF(Date date) {
        return getDateFormat(date, "yyyy��MM��dd�� HH:mm");
    }

    /**
     * ���ڸ�ʽ��(yyyy��MM��dd�� HH:mm:ss)
     * 
     * @param Date
     * @return String
     * */
    public static String fDateCNYRSFM(Date date) {
        return getDateFormat(date, "yyyy��MM��dd�� HH:mm:ss");
    }

    // ****************************ʱ���ʽ��Stringת��ΪString****************************
    /**
     * ���ݸ�����ʱ���ʽ�ַ�����ȡ������ʽ���ַ���
     * 
     * @param d
     *            String ����ʱ���ʽΪyyyy-MM-dd HH:mm:ss
     * @param format
     *            String �����ĸ�ʽ
     * @return String
     */
    public static String getDateFormat(String d, String format)
            throws ParseException {
        Date date = datetime.parse(d);
        return getDateFormat(date, format);
    }

    // ****************************ʱ���ʽ��Stringת��Ϊlong****************************
    /**
     * ͨ���ַ������long��ʱ��
     * 
     * @param String
     * @return long
     */
    public static long getDateFromStr(String dateStr) {
        long temp = 0L;
        Date date = null;
        try {
            date = datetime.parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
            return temp;
        }
        temp = date.getTime();
        return temp;
    }

    // ****************************Dateת��Ϊ������ʽ��Date****************************
    /**
     * ���ڸ�ʽ����2014-03-04��
     * 
     * @param Date
     * @return Date
     * @throws ParseException
     * */
    public static Date fDate(Date dat) throws ParseException {
        String dateStr = date.format(dat);
        return date.parse(dateStr);
    }

    /**
     * ͨ����ʼʱ��ͼ����ý���ʱ�䡣
     * 
     * @param String
     * @param int
     * @return String
     */
    public static String getEndTime(String start, int span) {
        if (isNullOrNone(start) || span == 0) {
            return null;
        }
        long temp = getDateFromStr(start);
        temp += span * 60L * 1000L;
        return datetime.format(new Date(temp));
    }

    /**
     * ��ʽ���ַ�������2013-10-20 00:00:00.000000��Ϊ2013-10-20 00:00:00
     * 
     * @param String
     *            str
     * @return String
     * @throws ParseException
     * */
    public static String getFormatStringDay(String str) throws ParseException {
        Date date = datetime.parse(str);
        return datetime.format(date);
    }

    /**
     * �ж��Ƿ�Ϊ��
     * 
     * @param String
     * @return boolean
     */
    public static boolean isNullOrNone(String src) {
        if (null == src || "".equals(src)) {
            return true;
        }
        return false;
    }

    /**
     * ����ַ������ȴ���25���ȡǰ25���ַ��������ĳ�ʡ�Ժ�
     * 
     * @param String
     * @return String
     */
    public static String showCount(String str) {
        if (str != null) {
            if (str.length() > 25) {
                str = str.substring(0, 25);
                str = str + "...";
            }
        } else {
            str = "";
        }
        return str;
    }

    /**
     * �Ƿ�������ڸ�ʽyyyy-MM-dd
     * 
     * @param day
     *            String �����ַ���
     * @return boolean
     */
    public static boolean isFormatDay(String day) {
        return day
                .matches("(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)");
    }

    /**
     * �Ƿ����ʱ���ʽHH:mm:ss
     * 
     * @param time
     *            String ʱ���ַ���
     * @return boolean
     */
    public static boolean isFormatTime(String time) {
        return time
                .matches("(0[1-9]|1[0-9]|2[0-4]):(0[1-9]|[1-5][0-9]):(0[1-9]|[1-5][0-9])(\\.000000)?");
    }

    /**
     * �Ƿ����ʱ���ʽyyyy-MM-dd HH:mm:ss
     * 
     * @param time
     *            String ʱ���ַ���
     * @return boolean
     */
    public static boolean isFormat(String time) {
        String[] temp = time.split(" ");
        return isFormatDay(temp[0]) && isFormatTime(temp[1]);
    }

    /**
     * ͨ���������ꡢ�¡��ܻ�ø����ڵ�ÿһ������
     * 
     * @param year
     *            int ��
     * @param month
     *            int ��
     * @param week
     *            int ��
     * @return List<Date> ���������
     */
    public static List<Date> getDayByWeek(int year, int month, int week) {
        List<Date> list = new ArrayList<Date>();
        // �ȹ���������.
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        // ��������:
        c.set(Calendar.MONTH, month - 1);
        // ��������:
        c.set(Calendar.WEEK_OF_MONTH, week);
        // �õ����ܵ�һ��:
        for (int i = 0; i < 6; i++) {
            c.set(Calendar.DAY_OF_WEEK, i + 2);
            list.add(c.getTime());
        }
        // ���һ��:
        c.set(Calendar.WEEK_OF_MONTH, week + 1);
        c.set(Calendar.DAY_OF_WEEK, 1);
        list.add(c.getTime());
        return list;
    }

    /**
     * ��õ�ǰ�����Ǳ��µĵڼ���
     * 
     * @return int
     */
    public static int getCurWeekNoOfMonth() {
        Date date = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
    }

    /**
     * ��õ�ǰ���������ڼ�
     * 
     * @return int
     */
    public static int getCurWeekNo(String dat) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(dat);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * ��õ�ǰ�����
     * 
     * @return
     */
    public static int getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    /**
     * ��õ�ǰ���·�
     * 
     * @return
     */
    public static int getCurrentMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * ��õ�ǰ��������
     * 
     * @return
     */
    public static int getCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DATE);
    }
    /**
     * ��ȡ�������һ��
     * 
     * @param Date date
     * @param String format
     * @return String
     * */
    public static String lastDayOfMoth(Date date, String format){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH,1);
        cal.add(Calendar.MONTH,1);
        cal.add(Calendar.DATE, -1);
        date =  cal.getTime();;
        SimpleDateFormat sf = new SimpleDateFormat(format);
        return sf.format(date);
    }
    /**
     * ��ȡ�������һ��
     * 
     * @param Date date
     * @param String format
     * @return String
     * */
    public static String firstDayOfMoth(Date date, String format){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 0);
        date =  cal.getTime();;
        SimpleDateFormat sf = new SimpleDateFormat(format);
        return sf.format(date);
    }
    //****************************************************************
    /**
     * ת�����ַ������������������Integer��ʽ�ķ���0�������Double��ʽ�ķ���0.0
     * 
     * @param Object
     * @return String
     */
    public static String toString(Object o) {
        if (o == null) {
            if (o instanceof Integer) {
                return "0";
            }
            if (o instanceof Double) {
                return "0.0";
            }
            return "";
        } else {
            return o.toString();
        }
    }

    /**
     * ����ַ��������Ϊ������ת����null
     * 
     * @param String
     * @return String
     */
    public static String emptyString2Null(String src) {
        if (src != null) {
            if ("".equals(src)) {
                src = null;
            }
        }
        return src;
    }
    /**
     * ת���ɿ���hql��ʹ�õ��ַ���
     * 1,2 תΪ '1','2'
     * */
    public static String formatIds(String ids){
        if(ids!=null&&ids!="")
        {
            String[] id = ids.split(",");
            StringBuffer idsStr = new StringBuffer();
            for(String str : id){
                idsStr.append("'"+str+"',");
            }
            return idsStr.toString().substring(0,idsStr.length()-1);
        }
        else
        {
            return "";
        }
    }
    /**
     * ��ȡ��ǰ����ǰһ��
     * 
     * @param Date date
     * @return Date
     * */
    public static Date getSpecifiedDayBefore(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        c.set(Calendar.DATE, day-1);
        date = c.getTime();
        return date;
    }
    /**
     * �Ƚ��������ڵĴ�С
     * 
     * @param data1
     * @param data2
     * 
     * @return boolean
     * 
     * @author zhangss 2016-5-18 13:47:16
     * */
    public boolean bjDate(Date date1, Date date2){
        if (date1.getTime() > date2.getTime()) {
            return true;
        }
        return false;
    }
}
