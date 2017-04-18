package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by admin on 2017/4/18.
 */
public class DateDemo {
    public static void main(String[] args){
     /*   Date date = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("yyyy.MM.dd");

        System.out.println(ft.format(date));
        // 使用toString()显示日期和时间
        System.out.printf("%1$s %2$tB %2$td, %2$tY",
                "Due date:", date);*/

        init();
    }

    private static void init(){
        GregorianCalendar c = new GregorianCalendar();
        // 使用toString()显示日期和时间
        System.out.printf(c.toString());

        c.set(2009,3,12);
        System.out.printf(c.toString()+"\n");
        c.set(Calendar.DATE,10);
        System.out.printf(c.toString()+"\n");
        c.add(Calendar.DATE,10);
        System.out.printf(c.toString()+"\n");
        c.add(Calendar.DATE,-23);
        System.out.printf(c.toString()+"\n");

        // 获得年份
        int year = c.get(Calendar.YEAR);
// 获得月份
        int month = c.get(Calendar.MONTH) + 1;
// 获得日期
        int date = c.get(Calendar.DATE);
// 获得小时
        int hour = c.get(Calendar.HOUR_OF_DAY);
// 获得分钟
        int minute = c.get(Calendar.MINUTE);
// 获得秒
        int second = c.get(Calendar.SECOND);
// 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = c.get(Calendar.DAY_OF_WEEK);


    }
}
