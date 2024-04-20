import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int T = Integer.parseInt(st[0]);

        for (int i = 0; i < T; i++) {
            st = br.readLine().split(" ");

            int H = Integer.parseInt(st[0]);
            int W = Integer.parseInt(st[1]);
            int N = Integer.parseInt(st[2]);

            int h = (N-1) % H +1;
            int w = (N-1) / H +1;

            System.out.println((h * 100) + w);

        }
    }
}