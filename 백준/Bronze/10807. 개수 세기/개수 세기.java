import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] array = new int[N];
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
        
		int v = sc.nextInt();

		for (int j = 0; j < array.length; j++) {
			if(array[j] == v) {
				count++;
			}
		}

		System.out.println(count);
	}
}