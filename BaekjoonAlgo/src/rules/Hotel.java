package rules;

import java.util.Scanner;

public class Hotel {
	
	public static String hotel(int h, int w, int n) {
		
		int floor = n % h;
		if(floor == 0) floor = h;
		
		int room = ((n-1) / h) + 1;
		
		String result = String.format("%d%02d", floor,room);
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		int h, w, n;
		
		for(int i=0; i<testcase; i++) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();
			
			System.out.println(hotel(h,w,n));
		}
		
	}
}
