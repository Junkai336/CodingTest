import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = "";
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			S = sc.next();
			String first = S.substring(0, 1);
			String last = S.substring(S.length()-1, S.length());
			System.out.println(first + last);
		}
	}
}