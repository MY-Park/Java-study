package sorting;

import java.util.Scanner;

class Sort{
	private int[][] sort_arr;
	int idx = 0;
	
	public Sort(int[] arr) {
		this.sort_arr = new int[2][arr.length];
		this.sort_arr[0] = arr;
	}

	public int[] mergeSort() {
		int len = sort_arr[0].length;
		for(int i=0; i<log2(len); i++) { 
			int arr_idx = i % 2;
			int sort_idx = (i+1) % 2;
			idx = sort_idx;
			
			int l = 0;
			int r = l + (int)Math.pow(2,i);
			int range = (int)Math.pow(2,i);
			
			for(int j=0; j<len/(range*2)+1; j++) {
				int ini_l = l;
				int ini_r = r;
				int cnt = ini_l;
				
				while((l < ini_l + range && l < len) || (r < ini_r + range && r < len)) {
					if(l >= ini_l + range) {
						while(r < ini_r + range && r < len) {
							sort_arr[sort_idx][cnt] = sort_arr[arr_idx][r];
							cnt++;
							r++;
						}
						break;
					}else if(r >= ini_r + range || r >= len) {
						while(l < ini_l + range && l < len) {
							sort_arr[sort_idx][cnt] = sort_arr[arr_idx][l];
							cnt++;
							l++;
						}
						break;
					}else if(sort_arr[arr_idx][l] <= sort_arr[arr_idx][r]) {
						sort_arr[sort_idx][cnt] = sort_arr[arr_idx][l];
						cnt++;
						l++;
					}else if(sort_arr[arr_idx][r] <= sort_arr[arr_idx][l]) {
						sort_arr[sort_idx][cnt] = sort_arr[arr_idx][r];
						cnt++;
						r++;
					}
				}
				l = ini_r + range;
				r = l + range;
			}
		}
		return sort_arr[idx];
	}
	public static double log2(int n) {
		return Math.log(n)/Math.log(2);
	}
}
public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}

		Sort mySort = new Sort(arr);
		arr = mySort.mergeSort();
		
		String ans = "";
		
		for(int i=0; i<N; i++) {
			ans += arr[i]+"\n";
		}
		
		System.out.print(ans);
	}
}
