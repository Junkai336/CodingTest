import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int[] preResult = new int[X + 1];

        preResult[1] = 0;

        for (int i = 2; i <= X; i++) {
            preResult[i] = preResult[i - 1] + 1;

            if (i % 2 == 0) {
                preResult[i] = Math.min(preResult[i], preResult[i / 2] + 1);
            }

            if (i % 3 == 0) {
                preResult[i] = Math.min(preResult[i], preResult[i / 3] + 1);
            }
        }

        System.out.println(preResult[X]);

    }
}