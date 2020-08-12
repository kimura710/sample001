package aisatu.main;

public class sample003{
	public static void main(String[] args) {
		hello("World");
		hello("Japan");
		hello("Tokyo");
		System.out.println(add("Hello","World"));


	}
	public static void hello(String str) {
		System.out.println("Hello" + str);
	}
	public static String add(String x,String y) {
		return x + y;

	}


}