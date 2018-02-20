package stringDemo;

import java.util.Scanner;

public class Dial {
	
	public static int dialTime(char ch) {
		if(ch>=65 && ch <=79) return (ch-56)/3;
		else if(ch>=80 && ch<=83) return 8;
		else if(ch>=84 && ch<=86) return 9;
		else return 10;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int time = 0;
		
		for(int i=0; i<str.length(); i++) {
			time += dialTime(str.charAt(i));
		}
		
		System.out.println(time);
	}
}
