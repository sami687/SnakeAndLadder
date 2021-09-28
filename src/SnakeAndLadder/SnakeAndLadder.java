package SnakeAndLadder;
import java.lang.Math;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		System.out.println("Player - 1 die " +player(1));  // UC-6
		System.out.println("Player - 2 die " +player(2));  // UC -6
		// UC -7 Starts from here
		if((player(1)) > player(2)) {
			System.out.println("Player - 2 Won");
		}else {
			System.out.println("Player - 1 Won");
		}
		//UC - 7 ends here
	}
		
	public static int player(int player) {	
		int noOfPlayer = 1;  // UC -1
		int position = 0;	// UC -1
		boolean flag = true; 
		int j=0;
		while(flag) {
	      j = j+1;
		//System.out.println("Number of time die played = " + j++);
		int die  = ((int) (Math.random()*(6 - 1))) + 1;    //UC - 2
		int Option  = (int)(Math.random()*4);   //uc - 3
	
		
		// UC - 3 starts from here
		if (Option == 1) {
			position = position;
		}else if(Option == 2){
			position = position + die;
		}else if (Option == 3) {
			position = position - die;
			
		}
		// UC -3 ENDS HERE
		else if (position < 0) {
			
			position = 0;    //UC 4
		}
		else if (position == 100) {
			flag = false;  
			
			// UC -5 
		}
		
	
	}
		return j++;   //UC -6 , 7 COMBINE  OR System.out.println(j++);
	}		
	
	
}
