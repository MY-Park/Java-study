import java.util.Scanner;

public class Main {

	public static float max(float[] num) {
		float temp = 0;
		
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] > num[i + 1]) {
				temp = num[i + 1];
				num[i + 1] = num[i];
				num[i] = temp;
			}
		}

		return num[num.length - 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		float[] grade = new float[N];

		for (int i = 0; i < N; i++) {
			grade[i] = sc.nextFloat();
		}

		float max = max(grade);
		
		float sum = 0;
		
		for (int i = 0; i < N; i++) {
			grade[i] = grade[i] / max * 100;
			sum += grade[i];
		}
		
		System.out.printf("%.2f",sum/N);
	}
}
