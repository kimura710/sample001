public class sanmple001{
	public static void main(String[] args) {
		String a = "Hello Wolrd";

		System.out.println("挨拶の種類");
        String str = "昼";
		if(str.equals("朝")) {
        	  System.out.println("おはよう！");
          }else if(str.equals("昼")) {
        	  System.out.println("こんにちは！");
          }else {
        	  System.out.println("こんばんは！");
          }
        for (int h = 0; h < 10; h++){
        	if(h > 4) {
        		System.out.println("Hello");
        		continue;
        	}
          System.out.println(a);

        }
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());




	}
}