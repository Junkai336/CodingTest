import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int py = Integer.parseInt(br.readLine());
			if(py == 0) { break; }
			int sum = py*(py+1)/2;
			System.out.println(sum);
		}
	}
}
