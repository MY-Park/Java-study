package sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WordSort {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(st.nextToken());
		String[] str = new String[N];
		int[] len = new int[N];
		int[] same_len_max = new int[20001];
		
		int max_len = 0;
		int max_same = 0;
		
		String input = "";
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine().trim());
			input = st.nextToken();
			
			if(Arrays.asList(str).contains(input)) continue;
			
			str[i] = input;
			len[i] = str[i].length();
			same_len_max[len[i]]++;
			
			if(len[i] > max_len) max_len = len[i];
			if(same_len_max[len[i]] > max_same) max_same = same_len_max[len[i]];
		}
		
		String[] same_len = new String[max_same];

		int k=0;
		for(int i=1; i<=max_len; i++) {
			k=0;
			for(int j=0; j<N; j++) {
				if(len[j] == i) {
					same_len[k] = str[j];
					k++;
				}
			}
			Arrays.sort(same_len, 0, k);
			
			for(int l=0; l<k; l++) {
				bw.write(""+same_len[l] + "\n");
			}
		}
		
		bw.flush();
		bw.close();
		
	}
}
