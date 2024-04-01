import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] black = {1, 1, 2, 2, 2, 8};
		int[] white = new int[6];

		for(int i = 0; i < black.length; i++) {
			white[i] = Integer.parseInt(st.nextToken());
			if(white[i] == black[i]) {
				white[i] = 0;
				System.out.println(white[i]);
			} else if (white[i] > black[i]) {
				white[i] = ((white[i] - black[i]) * -1);
				System.out.println(white[i]);
			} else if (black[i] > white[i]) {
				white[i] = ((white[i] - black[i]) * -1);
				System.out.println(white[i]);
			}
		}

	}
}