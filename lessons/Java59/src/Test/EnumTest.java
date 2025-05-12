/**
 * 
 */
package Test;

/**
 * @author NGUYEN THI LANG
 *
 */
public class EnumTest {
	
public static void main(String[] args) {
	ThoiKhoaBieu t1 = new ThoiKhoaBieu(Day.Monday, "Math");
	ThoiKhoaBieu t2 = new ThoiKhoaBieu(Day.Friday, "Literature");
	ThoiKhoaBieu t3 = new ThoiKhoaBieu(Day.Sunday, "Physics");
	ThoiKhoaBieu t4 = new ThoiKhoaBieu(Day.Monday, "Chemistry");
	System.out.println(t4);
	
	int m1 = Month.February.numOfDays();
	System.out.println("Thang 2 có: " +m1+" ngay");
	
	int m2 = Month.December.numOfDays();
	System.out.println("Thang 12 có: " +m2+" ngay");
}
}
