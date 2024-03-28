import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String Q = sc.next();
		String Q2 = sc.next();

		char[] A = new char[Q.length()];
		char[] A2 = new char[Q2.length()];

		for(int i = Q.length() -1; i >= 0; i--) {
			A[i] = Q.charAt(Q.length() + (-1 - i));	
		}

		for(int j = Q2.length() -1; j >= 0; j--) {
			A2[j] = Q2.charAt(Q2.length() + (-1 - j)) ;
		}

		String AA1 = String.valueOf(A);
		String AA2 = String.valueOf(A2);

		if(Integer.parseInt(AA1) > Integer.parseInt(AA2)) {
			System.out.println(AA1);
			return;
		}
		System.out.println(AA2);

	}
}