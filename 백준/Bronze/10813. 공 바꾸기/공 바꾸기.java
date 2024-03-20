import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array = new int[N];
		int M = sc.nextInt();
		int temp;

		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}

		for(int j = 0; j < M; j++) {
			int I = sc.nextInt();
			int J = sc.nextInt();

			temp = array[I-1];
			array[I-1] = array[J-1];
			array[J-1] = temp;
		}

		for(int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
	}
}