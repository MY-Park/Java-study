package stringDemo;

import java.util.Scanner;

public class Alphabet {
	
	public static int alphabet(String str, char c) {
		
		for(int i=0; i < str.length() ; i++) {
			if(str.charAt(i) == c) return i;
			else if(i==str.length()-1) return -1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String out = "";
		
		for(int i=97; i<123; i++) {
			out += alphabet(str,(char)i);
			if(i != 122) out += " ";
		}
		
		System.out.println(out);
	}
}
