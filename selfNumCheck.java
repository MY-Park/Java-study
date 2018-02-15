public class Main {
	public static int min(int n1, int n2) {
		if(n1 >= n2) return n2;
		else return n1;
	}
	
	public static boolean selfNumCheck(int num) {
		
		int d  = 0;
		
		for(int i=0; i<=min(num/1000,9); i++) {
			 for(int j=0; j<=min(num/100,9); j++) {
				 for(int k=0; k<=min(num/10,9); k++) {
					 for(int l=0; l<10; l++) {
						 d = 1001*i + 101*j + 11*k + 2*l;
						 if(d == num) return false;
						 }
					 }
				 }
			 }
		return true;
	}
	

	public static void main(String[] args) {
				
		for(int i=1; i<=10000; i++) {
			if(selfNumCheck(i)) System.out.println(i);
		}
	}
}
