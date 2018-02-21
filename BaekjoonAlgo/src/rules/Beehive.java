package rules;

import java.util.Scanner;

public class Beehive {
	public static int beehive(int N) {
		
		if(N == 1) return 1;
		
		int sum = 0;
		int r = 1;
		int a = 6;
		
		while(sum<N) {
			sum = 1+r*(2*a + (r-1)*6) / 2;
			r++;
		}
		
		return r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
			
		System.out.println(beehive(N));
	}
}
