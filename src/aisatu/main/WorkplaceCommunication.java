package aisatu.main;

import java.util.Random;
import java.util.Scanner;

public class WorkplaceCommunication implements Communication{
	private boolean Workplace;
	private String loginName;

	@SuppressWarnings("resource")
	public void greet(){
		System.out.println("好きな文字を入力して下さい");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(str);
	}
	public boolean Workplace() {
		Random r = new Random();
		boolean wo = r.nextBoolean();
		if(wo == true) { this.greet();}
		return false;
	}
	public boolean isWorkplace() {return Workplace;}
	public String name() {return this.loginName;}
	public void setLoginName(String loginName) {
		if(loginName == null) {
			throw new IllegalArgumentException
			("名前がnullです。処理中断");
		}if(loginName.length() <= 1 ) {
			throw new IllegalArgumentException
			("名前が短すぎます");
		}this.loginName = loginName;
	}
	public String animal(String type)throws UnsupportedAnimalException{
		if(!(type.equals("cat"))) {
			throw new UnsupportedAnimalException
			("猫以外のペットはオフィスに入れません");
		}
		return type;
	}
	}


