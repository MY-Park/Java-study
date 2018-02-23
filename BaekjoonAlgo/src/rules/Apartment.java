package rules;

import java.util.Scanner;

public class Apartment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		int[][] apt = new int[15][14];
		
		for(int i=0; i<14; i++) {
			apt[0][i] = i+1; // 0th room in 0th floor, 1 person
		}
		
		for (int k=1; k<15; k++) {
			for(int n=0; n<14; n++) {
				for(int l=0; l<=n; l++) {
					apt[k][n] += apt[k-1][l];
				}
			}
		}
		
		for (int i=0; i<testcase; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(apt[k][n-1]);
		}
		
	}
}
