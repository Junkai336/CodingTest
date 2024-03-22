import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] score = new int[N];
		double[] avg = new double[N];

		for(int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
		}

		Arrays.sort(score);

		int max = score[score.length-1];

		for(int i = 0; i < score.length; i++) {
			avg[i] = (double) score[i] / max * 100;
		}

		double sum = 0;

		for(int i = 0; i < avg.length; i++) {
			sum += avg[i];
		}

		System.out.println(sum / avg.length);

	}
}