import java.util.Arrays;

/**
 * @author NGUYEN THI LANG Mang va copy mang(3cach)
 */
public class ViDu {
	public static void main(String[] args) {
		// kieu nguyen thuy
		// VD1:
		int[] mang1 = { 1, 2, 3 };

		// copy mang cach 1:
		int[] mang1_a = mang1;
		mang1_a[0] = 100;
		System.out.println("mang1: " + Arrays.toString(mang1));
		System.out.println("mang1_a: " + Arrays.toString(mang1_a));
		// ca 2 mang1 va mang1_a deu bi thay doi

		// copy mang cach 2: dung ham clone(thuong dung)
		int[] mang1_b = mang1.clone();
		mang1_b[0] = 50;
		System.out.println("mang1: " + Arrays.toString(mang1));
		System.out.println("mang1_b: " + Arrays.toString(mang1_b));
		// cach nay thi mang1 khong bi thay doi

		// copy mang cach 3: dung ham System.arraycopy
		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 20;
		System.out.println("mang1:" + Arrays.toString(mang1));
		System.out.println("mang1_c:" + Arrays.toString(mang1_c));

		// VD2
		String[] mang2 = { "Lang", "An" };

		// copy mang cach 1:
		String[] mang2_a = mang2;
		mang2_a[0] = "Phong";
		System.out.println("mang 2: " + Arrays.toString(mang2));
		System.out.println("mang 2_a: " + Arrays.toString(mang2_a));

		// copy mang cach 2: dung ham clone
		String[] mang2_b = mang2.clone();
		mang2_b[0] = "Phong";
		System.out.println("mang 2_b: " + Arrays.toString(mang2_b));

		// copy mang cach 3: dung ham System.arraycopy
		String[] mang2_c = new String[mang2.length];
		System.arraycopy(mang2, 0, mang2_c, 0, mang2.length);
		System.out.println("mang 2_c: " + Arrays.toString(mang2_c));

	}
}
