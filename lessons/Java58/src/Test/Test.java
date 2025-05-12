/**
 * 
 */
package Test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * @author NGUYEN THI LANG Cac lop quan li thoi gian va ngay thang trong Java
 */
public class Test {
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			System.out.println("LANG");
		}
		long t2 = System.currentTimeMillis();

		System.out.println("Truoc khi chay for: " + t1);
		System.out.println("Sau khi chay for: " + t2);
		System.out.println("Thoi gian: " + (t2 - t1) + "mls");
		System.out.println("Thoi gian: " + (t2 - t1) / 1000 + "s");

		// TimeUnit
		System.out.println("1000 nam = " + TimeUnit.DAYS.toSeconds(1000 * 365) + "s");
		System.out.println("30 gio = " + TimeUnit.HOURS.toSeconds(30) + "s");
		System.out.println("3 ngay = " + TimeUnit.DAYS.toHours(3) + "h");

		// Date
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));

		// Calender
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));

		c.add(Calendar.HOUR, 10);
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));

		c.add(Calendar.DATE, 100);
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));

		// DateFormat
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));

		df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(df.format(d));
	}
}
