package code5_10;

public class Main {

	public static int add(int x, int y) {
		return x + y;
	}

	public static double add(double x, double y) {
		return x + y;
	}
	
	public static String add(String x, String y) {
		return x + y;
	}
	
	public static int add(int x, String y) {
		return x + y.length();
	}

	
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("Hello", "World"));
	}

}
