import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine()); // 층수
            int n = Integer.parseInt(br.readLine()); // 호수

            int[][] apart = new int[15][15]; // 14층 14호까지 있음

            for (int j = 1; j < 15; j++) {
                apart[0][j] = j; // 0층은 인원 정해져있음
            }

            for (int j = 1; j < 15; j++) {
                for (int l = 1; l < 15; l++) {
                    // 같은층수 이전호수 + 이전층수 같은호수
                    apart[j][l] += apart[j - 1][l] + apart[j][l - 1];
                }
            }

            System.out.println(apart[k][n]);

        }

    }
}
