import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int temp = 0;
		int basket[] = new int[N];

		for(int i=0; i<basket.length; i++) {
			basket[i] = i+1;
		}

		for(int i=0; i<M; i++) {
			int I = sc.nextInt()-1;
			int J = sc.nextInt()-1;

			while(I<J) {
				temp = basket[I];
				basket[I] = basket[J];
				basket[J] = temp;
				I++;
				J--;
			}
		}

		for(int i=0; i<basket.length; i++) {
			System.out.print(basket[i] + " ");
		}


	}
}