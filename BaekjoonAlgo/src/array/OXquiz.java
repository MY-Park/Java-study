package array;

import java.util.Scanner;

public class OXquiz {
	
	public static int oxquiz(String input) {
		
		int zeroNum = 0;
		int totalNum = 0;
		
		for(int i=0; i<input.length(); i++) {
			if ((input.charAt(i)+"").equals("O")) {
				zeroNum++;
				totalNum += zeroNum;
			}
			else zeroNum = 0;
		}
		return totalNum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		String input = "";
		
		for(int i=0; i<testcase; i++) {
			input = sc.next();
			System.out.println(oxquiz(input));
		}
	}
}
