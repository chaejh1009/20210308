package copy;

public class Test {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[]b = a;
		b[0] = 50;
		System.out.println(b);
		System.out.println(a);
	}

}
