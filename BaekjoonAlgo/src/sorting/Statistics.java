package sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;

public class Statistics {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[8001];
		double mean_d = 0;
		int mean = 0;
		
		int idx;
		
		for(int i=0; i<N; i++) {
			idx = Integer.parseInt(new StringTokenizer(br.readLine().trim()).nextToken());
			arr[idx+4000]++;
			mean += idx;
		}
		
		mean_d = mean;

		mean = (int)(Math.round(mean_d / N));

		int med = 0;
		int med_idx, range;
		int freq_value = 0;
		
		
		for(int i=0; i<8001; i++) {
			if(arr[i] > freq_value) {
				freq_value = arr[i];
			}
		}
		int [] freq_arr = new int [8001];
		int j = 0;
		
		for(int i=0; i<8001; i++) {
			if(arr[i] == freq_value) {
				freq_arr[j] = i - 4000;
				j++;
			}
		}
		
		int freq = 0;
		
		if(j == 1) freq = freq_arr[0];
		else freq = freq_arr[1];
		
		int min_val = 0;
		int max_val = 0;
		
		for(int i=0; i<8001; i++) {
			if(arr[i] != 0) {
				min_val = i - 4000;
				break;
			}
		}
		
		for(int i=8000; i>=0; i--) {
			if(arr[i] !=0) {
				max_val = i - 4000;
				break;
			}
		}
		range = max_val - min_val;
		
		med_idx = 0;
		boolean forbreak = false;
		
		for(int i=0; i<8001; i++) {
			while(arr[i] > 0) { 
				arr[i] --;
				if(med_idx == N / 2) {
					med = i - 4000;
					forbreak = true;
					break;
				}
				med_idx ++;
		}
			if(forbreak) break;
	}
		
		bw.write(""+(int)mean+"\n"+med+"\n"+freq+"\n"+range);
		bw.flush();
		bw.close();
	}
}
