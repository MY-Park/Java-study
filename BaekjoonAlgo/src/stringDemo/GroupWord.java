package stringDemo;

import java.util.Scanner;

public class GroupWord {
	public static int groupChecker(String str) {
		
		char[] alphabet = new char[26];
		int kind = 0;
		
		alphabet[0] = str.charAt(0);
		kind++;
		
		for(int i=1; i<str.length(); i++) {
			for(int j=0; j<kind; j++) {
				if((alphabet[j]+"").equals(str.charAt(i)+"")) {
					if(j==kind-1) break;
					else return 0;
				} else {
					if(j==kind-1) {
						alphabet[kind] = str.charAt(i);
						kind++;
						break;
					}
				}
			}
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int testcase = sc.nextInt();
		 String str = ""; 
		 int group = 0;
		 
		 for(int i=0; i<testcase; i++) {
			 str = sc.next();
			 group += groupChecker(str);
		 }
		 
		 System.out.println(group);
		 
	}
}
