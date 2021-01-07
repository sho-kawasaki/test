package Java_study1_1;

import java.util.Random;

public class Java_study1_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//じゃんけん
	    String[] hands = { "グー", "チョキ", "パー" };
	    Random r = new Random();
	  
	      String hand = hands[r.nextInt(3)];
	      System.out.println(hand);
	
		
	    
	      
		
		
		
	}

}
