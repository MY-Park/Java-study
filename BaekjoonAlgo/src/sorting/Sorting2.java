package sorting;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Sorting2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(st.nextToken());
		
		boolean arr[] = new boolean[2000001];
		int num = 0;
		
		for(int i=0; i<N; i++) {
			num = Integer.parseInt(new StringTokenizer(br.readLine().trim()).nextToken());
			
			if(num < 0) {
				arr[-num + 1000000] = true;
			}else arr[num] = true;
		}
		
		for(int i=arr.length-1; i>1000000; i--) {
			if(arr[i]) bw.write("" + -(i-1000000) + "\n");
		}for(int i=0; i<1000001; i++) {
			if(arr[i]) bw.write("" + i + "\n");
		}
		bw.flush();
		bw.close();
	}
}
