package array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumofNums {
	
	public static int count(String mul, int n) {
		int cnt = 0;

		for(int i=0; i < mul.length(); i++) {
			if((mul.charAt(i)+"").equals(""+n)) {
				cnt++;
			}
		}
		return cnt;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		String mul = String.valueOf(A * B * C);
		
		for(int i=0; i<=9; i++) {		
			System.out.println(count(mul,i));
		}
		
	}
}
