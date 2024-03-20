import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array = new int[N];

		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int I = sc.nextInt();
			int J = sc.nextInt();
			int K = sc.nextInt();

			for(int j = I - 1; j < J; j++) {
				array[j] = K;
			}
		}
		for(int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
	}
}