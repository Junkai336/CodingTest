import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[26];

		for (int i = 0; i < array.length; i++) {
			array[i] = -1;
		}

		String S = sc.nextLine();

		for (int i = 0; i < S.length(); i++) {
			char stch = S.charAt(i);

			if (array[stch - 'a'] == -1) {
				array[stch - 'a'] = i;
			}
		}

		for (int ii : array) {
			System.out.print(ii + " ");
		}
	}
}
