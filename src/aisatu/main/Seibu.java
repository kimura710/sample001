package aisatu.main;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Seibu{


public static void main(String[] args) {
		String greeting = "HelloWorld";
		System.out.println(greeting);

		int sum = 0;
		  for(int x =1; x <= 10; x++) {
			 sum += x;
			 if(sum == 55) {
			System.out.println(sum);}
			}
		int x = 1;
		  if(x == 1) {
			     System.out.println("真");
			 }else {
				 System.out.println("偽");
			 }
		 List<String> list = new ArrayList<>();

		    list.add("Tokyo");list.add("Nagoya"); list.add("Oosaka");list.add("Hukuoka");

		    for(String str : list) {

		    System.out.println(str);
		    }
		 LocalDateTime today =  LocalDateTime.now();
		 DayOfWeek day = today.getDayOfWeek();

		 LocalDateTime future_year = today.plusYears(3);
		 DayOfWeek future_day = future_year.getDayOfWeek();

         System.out.println("今日は" + day);
		 System.out.println("３年後は" + future_day);
	}
}
