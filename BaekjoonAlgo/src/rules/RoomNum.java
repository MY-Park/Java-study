package rules;

import java.util.Scanner;

public class RoomNum {
	public static int set(int room) {
		
		if(room == 0) return 1;
		
		int[] num = new int[9];
		int N = room;
		int input = 0;
		int max = 0;
		
		for(int i=0; i<(int)Math.log10(room)+1; i++) { // N.length
			input = N % 10;
			N /= 10;
			
			if(input == 9) input = 6;
			num[input]++;
		}
		
		num[6] = (num[6] + 1) / 2;
		
		for(int i=0; i<9; i++) {
			if(max < num[i]) max = num[i];
		}
		
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(set(N));
	}
}
