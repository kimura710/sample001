
package aisatu.main;

public class sample002{
	public static void main(String[] args) {
		System.out.println(add("Hello"));
		System.out.println(add("Hello","World"));
		System.out.println(add("Hello","Japan","Tokyo"));

		char[] as = {'H','e','l','l','o'};
		for(int a = 0; a < as.length; a++) {
			System.out.print(as[a]);
		}
		char[] ai = {'W','o','r','l','d'};
		for(char ass : ai) {
			System.out.print(ass);
		}
	}
	public static String add(String x) {
		return x;
	}
	public static String add(String x,String y) {
		return x + y;
	}
	public static String add(String x,String y,String z) {
		return x + y + z;
	}

}