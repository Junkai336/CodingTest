import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] A = new int[9];

		for (int i = 0; i < 9; i++) {
			A[i] = sc.nextInt();
		}

		int max = 0;
		int count = 0;
		int index = 0;

		for(int i = 0; i < A.length; i++) {
			count++;
			if(max < A[i]) {
				max = A[i];
				index = count;
			}
		}

		System.out.println(max);
		System.out.println(index);

	}
}
