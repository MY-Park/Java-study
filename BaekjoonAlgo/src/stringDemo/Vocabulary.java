package stringDemo;

import java.util.Scanner;

public class Vocabulary {
	public static Character mostFreq(String input) {
		
		Character[] alphabet = new Character[26];
		int[] frequency = new int[26];
		int kind = 0;
		
		String str = input.toUpperCase();
		
		alphabet[0] = str.charAt(0);
		frequency[0] = 1;
		kind++;
		
 		for(int i=1; i<str.length(); i++) {
			for(int j=0; j<kind; j++) {
				if(alphabet[j].equals(str.charAt(i))) {
					frequency[j]++;
					break;
				}else if(j == kind-1) {
					alphabet[kind] = str.charAt(i);
					frequency[kind] = 1;
					kind++;
					break;
				}
			}
		}
 		
 		int maxIdx = 0;
 		int maxValue = 0;
 		int secondValue = 0;
 		
 		for(int i=0; i<kind; i++) {
 			if(frequency[i] >= maxValue) {
 				secondValue = maxValue;
 				maxValue = frequency[i];
 				maxIdx = i;
 			}
 		}
		
 		if(secondValue == maxValue) return (Character)'?';
 		else return alphabet[maxIdx];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(mostFreq(str));
		
	}
}
