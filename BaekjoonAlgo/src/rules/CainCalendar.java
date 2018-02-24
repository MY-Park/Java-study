package rules;
import java.util.Scanner;

// reference: http://mizzo-dev.tistory.com/entry/baekjoon6064

public class CainCalendar {
	
	public static long lcm(int a, int b) {
		return (long)(a * b / gcd(a,b) );
	}
	
	public static int gcd(int a, int b) {
		while(b!=0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
	
	public static int Cain (int M, int N, int x, int y) {
		int ans=-1; // if ans exist ans = Ma + x = Nb + y
		boolean exist = false;
		int lcmMN = (int)lcm(M,N);
		
		if(M == x && N == y) return (int)lcm(M,N);
		
		if(M==x) {
			for(int a = 1; ; a++) {
				ans = a * M;
				if(ans % N == y) return ans;
				else if(ans >= lcmMN) return -1;
			}
		}else if(N ==y) {
			for(int a = 0; ; a++) {
				ans = M * a + x;
				if((ans % N)  == 0) {
					if(ans / N > 0) return ans;
				}
				else if(ans >= lcmMN) return -1;
			}
		}
		
		for(int a = 0; ; a++) {
			ans = M * a + x;
			if(ans % N == y) {
				exist = true;
				break;
			}else if(ans >= lcmMN) {
				exist = false;
				break;
			}
		}
		
		if(exist) return ans;
		else return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		for(int i=0; i<testcase; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int temp = 0;
			
			if(M < N) {
				temp = M;
				M = N;
				N = temp;
				
				temp = x;
				x = y;
				y = temp;
			}

			
			System.out.println(Cain(M,N,x,y));
		}
			
	}
}
