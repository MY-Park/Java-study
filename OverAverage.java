import java.util.Scanner;

public class Main {

	public static float average(float[] num) {
		float sum = 0;	
		for(float d: num) sum += d;
		
		return sum / num.length;
	}
	
	public static float overAvg(float[] num) {
		float over = 0;
		float avg = average(num);
		
		for(int i=0; i<num.length; i++) {
			if(num[i] > avg) {
				over += 1;
			}
		}
		return over / num.length * 100;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Testcase = sc.nextInt();
		int t = 0;
		
		for(int i=0; i<Testcase; i++) {
			t = sc.nextInt();
			float[] num = new float[t];
			
			for(int j=0; j<t; j++) {
				num[j] = sc.nextFloat();
			}
			System.out.printf("%.3f%%",overAvg(num));
			System.out.println();
		}
		
	}
}
