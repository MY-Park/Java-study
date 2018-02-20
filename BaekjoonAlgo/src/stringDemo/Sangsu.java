package stringDemo;

//reverseString function
//http://mwultong.blogspot.com/2006/11/java-reverse-string.html

import java.util.Scanner;

public class Sangsu {
	public static String reverseString(String s) {
		return(new StringBuffer(s).reverse().toString());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] nums = input.split(" ");
		
		String[] reverseNums = new String[2];
		reverseNums[0] = reverseString(nums[0]);
		reverseNums[1] = reverseString(nums[1]);
		
		int A = Integer.parseInt(reverseNums[0]);
		int B = Integer.parseInt(reverseNums[1]);
		
		String out = "";
		
		if(A > B) out = reverseNums[0];
		else out = reverseNums[1];
		
		System.out.println(out);
		
	}

}
