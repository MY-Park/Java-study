import java.util.Scanner;

public class Main {

	public static boolean hansuCheck(int num) {
		if(num / 10 < 10 ) return true;
		else {
			if (((num/10) % 10) * 2 == num/100 + num%10) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			if(hansuCheck(i)) cnt++;
		}
		System.out.println(cnt);
	}
}
