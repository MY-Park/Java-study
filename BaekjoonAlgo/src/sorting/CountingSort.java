package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class CountingSort{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[10001];
        int num;
        for(int i=0; i<N; i++){
           num = Integer.parseInt(new StringTokenizer(br.readLine().trim()).nextToken());
           arr[num]++;
        }
        
        for(int i=0; i<10001; i++){
            while(arr[i]!=0){
                bw.write(""+i + "\n");
                arr[i]--;
            }
        }
        
        bw.flush();
        bw.close();
    }
}