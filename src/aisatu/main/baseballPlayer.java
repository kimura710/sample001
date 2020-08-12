package aisatu.main;

public class baseballPlayer extends player{
	boolean hit;
	String catching;
	int fly;
	private String name;


	public void play() {
		System.out.println(this.name + "は野球をする");
	}
	public void hit() {
		System.out.println("ボールを打った");
		int fly = new java.util.Random().nextInt(3);
		switch(fly) {
		  case 0:
			System.out.println("ヒット");
			break;
		  case 1:
			System.out.println("アウト");
			break;
		  case 2:
			System.out.println("ホームラン");
			break;
		}
		}
	public void catching() {
		System.out.println("捕球する");
	}
	public void run() {}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;

	}


}
