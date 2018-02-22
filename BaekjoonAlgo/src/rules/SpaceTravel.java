package rules;

import java.util.Scanner;

public class SpaceTravel {
	
	public static int spaceTravel(long dist) {
		
		int move = 0;
		
		double rt = Math.sqrt(dist);
		int int_rt = (int)Math.sqrt(dist);
		
		if(rt == int_rt) move = int_rt * 2 - 1;
		else {
			if(dist <= Math.pow(int_rt,2) + int_rt) move = int_rt * 2;
			else move = int_rt* 2 + 1;
		}
		
		return move;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		long x = 0;
		long y = 0;
		
		for(int i=0; i<testcase; i++) {
			x = sc.nextLong();
			y = sc.nextLong();
			
			System.out.println(spaceTravel(y-x));
		}
	}
}
