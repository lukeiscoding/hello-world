public class Unary {
	public static void main(String[] args) {
		int i = +10;
		int j = -10;
		int k = i++;
		System.out.println("k = " + k);
		System.out.println("i = " + i);
		int l = j--;
		System.out.println("l = " + l);
		System.out.println("i = " + j);
		boolean b = true;
		b = !b;
		System.out.println(b);
	}
}