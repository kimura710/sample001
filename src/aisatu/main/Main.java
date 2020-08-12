package aisatu.main;

public class Main {


	public static void main(String[] args) {
		WorkplaceCommunication w = new WorkplaceCommunication();
        w.Workplace();
        try {
        	String str = w.animal("");
        	System.out.println(str);
        }catch(UnsupportedAnimalException e) {
        	e.printStackTrace();
        }
	}



}
