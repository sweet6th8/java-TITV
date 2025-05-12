import java.util.Arrays;

/**
 * 
 */

/**
 * @author NGUYEN THI LANG
 *
 */
public class ViDu {
    public static int[] reverse(int[] x) {
    	int[] res = new int[x.length];
    	int index =0;
    	for(int i=x.length-1; i>=0;i--) {
    		res[index]=x[i];
    		index++;
    	}
		return res;
    }

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 9, 4, 6, 0 };
		int[] b = new int[12];

		System.out.println("a ban dau la: " + Arrays.toString(a));

		// Ham sap xep tang dan:
		Arrays.sort(a);
		System.out.println("a sau khi sap xep: " + Arrays.toString(a));

		// Ham tim kiem:
		System.out.println(Arrays.binarySearch(a, 6)); //phai sort truoc thì mới search được
		System.out.println(Arrays.binarySearch(a, 3));

		// Ham dien gia tri:
		Arrays.fill(b, 7);
		System.out.println("b sau khi dien gia tri la: " + Arrays.toString(b));
		
		// Ham sap xep giam dan:
		Arrays.sort(a);
		a=ViDu.reverse(a);
		System.out.println("a sau khi sap xep:"+Arrays.toString(a));
		
	}
	
	
}
