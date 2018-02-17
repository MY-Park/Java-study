package array;
import java.util.Scanner;

public class Scale {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scale = new int[8];
		
		for(int i=0; i<8; i++) {
			scale[i] = sc.nextInt();
		}
		
		for(int i=0; i<8; i++) {
			if(scale[i]!=i+1) {
				break;
			}else if(scale[i] == 8) {
				System.out.println("ascending");
				return;
			}
		}
		
		for(int i=0; i<8; i++) {
			if(scale[i]!=8-i) {
				break;
			}else if(scale[i] == 1) {
				System.out.println("descending");
				return;
			}
		}
		System.out.println("mixed");
		
	}
}
