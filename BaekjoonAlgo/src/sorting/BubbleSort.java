package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] sorted_arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sorted_arr = arr;
		
		Arrays.sort(sorted_arr);
		
		String ans = "";
		
		for(int i=0; i<N; i++) {
			ans += sorted_arr[i];
			if(i == N-1) break;
			ans += "\n";
		}
		System.out.println(ans);
	}
}
