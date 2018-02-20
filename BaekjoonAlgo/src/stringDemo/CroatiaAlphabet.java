package stringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class CroatiaAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int startIdx = 0;
		int num = 0;
		
		String str[] = new String[] {"c=","c-","dz=","d-","lj","nj","s=","z="};
		//System.out.println(Arrays.asList(str).contains("ac"));
		
		boolean value = false;
		String substring = "";
		
		
		while(startIdx < input.length()) {
			for(int i=0; i<3; i++) {
				substring = input.substring(startIdx,startIdx+i+1);
				value = Arrays.asList(str).contains(substring);
				if(value) {
					startIdx = startIdx+i+1;
					num++;
					break;
				}else if(i==2) {
					startIdx++;
					num++;
					break;
				}else if(startIdx+i+1 == input.length()) {
					startIdx += i+1;
					num += i+1;
					break;
				}
			}
		}
		
		System.out.println(num);
	}
}
