package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		int temp = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 2-i; j++) {
				if(num[j] > num[j+1]) {
					temp = num[j+1];
					num[j+1] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println(num[1]);
	}
}
