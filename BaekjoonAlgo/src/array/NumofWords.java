package array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumofWords {
	public static void main(String[] args) {
		//System.out.println("hello");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(input);
		
		System.out.println(st.countTokens());
		
		sc.close();
	}
}
