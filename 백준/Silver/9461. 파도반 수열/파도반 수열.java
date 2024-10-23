import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // P(N) = P(N-2) + P(N-3)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        long[] array = new long[101];

        for (int i = 1; i <= 3; i++) {
            array[i] = 1;
        }

        for (int i = 4; i <= 100; i++) {
            array[i] = (array[i - 2] + array[i - 3]);
        }

        for (int t = 0; t < T; t++) {
            int input = Integer.parseInt(br.readLine());

            System.out.println(array[input]);
        }
    }
}