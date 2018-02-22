package rules;

import java.util.Scanner;
public class Fraction {
	
	public static String fraction(int N) {
		
		int n = 1;
		int sum = 0;
		
		int num = 1;
		int denom = 1;
		
		while(sum < N) {
			sum = n*(n+1)/2;
			if(sum < N) n++;
		}		
		
		sum = (n-1)*n / 2;
		int res = N - sum;
		
		if(n % 2 == 0) {
			num = 1; 
			denom = n;
			
			for(int i=1; i<res; i++) {
				num++;
				denom--;
			}
			
		}else {
			num = n;
			denom = 1;
			
			for(int i=1; i<res; i++) {
				num--;
				denom++;
			}
		}
		return ""+num+"/"+denom;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(fraction(N));
				
	}
}
