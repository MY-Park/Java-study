package sorting;

import java.util.Scanner;

public class SortInside {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[10];
		int len = 0;
		
		while(N != 0) {
			arr[N % 10] ++;
			N /= 10;
			len++;
		}
		
		String ans = "";
		
		for(int i=9; i>=0; i--) {
			while(arr[i]!=0) {
				ans += i;
				arr[i]--;
			}
		}
		System.out.println(ans);
	}
}
