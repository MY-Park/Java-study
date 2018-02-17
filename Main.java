package org.opentutorials.javatutorials.io;

import java.util.Scanner;


public class Main {
	
	public static char[][] output;
	
	public static void draw(int h, int x, int y) {
		
		if(h==3) {
			output[x-2][y] = output[x-1][y-1] = output[x-1][y+1] = '*';
			output[x][y-2] = output[x][y-1] = output[x][y] = output[x][y+1] = output[x][y+2] = '*';
			return;
		}
		
		draw(h/2, x-(h/2), y);
		draw(h/2, x, y-(h/2));
		draw(h/2, x, y+(h/2));
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		output = new char[n][n*2-1];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n*2-1; j++) {
				output[i][j] = ' ';
			}
		}
		
		draw(n, n-1, n-1);
		
		String out;
		
		for (int i=0; i<n; i++) {
			System.out.println(output[i]);
			//System.out.println();
		}
	}
}
