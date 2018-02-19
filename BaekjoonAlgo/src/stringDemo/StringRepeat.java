package stringDemo;

import java.util.Scanner;

public class StringRepeat {
	public static String repeat(String str, int i) {
		
		String out = "";
		
		for(int j=0; j<str.length(); j++) {
			for(int k=0; k<i; k++) {
				out += str.charAt(j);
			}
		}
		
		return out;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		int t = 0;
		for(int i=0; i<testcase; i++) {
			t = sc.nextInt();
			System.out.println(repeat(sc.next(),t));
		}
	}
}
