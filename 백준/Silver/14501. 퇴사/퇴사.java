import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1]; // 최대 수익

        int[] ti = new int[N + 1]; // 상담 걸리는 시간
        int[] pi = new int[N + 1]; // 상담 수익

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            ti[i] = Integer.parseInt(st.nextToken());
            pi[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N - 1; i >= 0; i--) {                              // N : 총일수 , i : i일차
            if (i + ti[i] <= N) {                                       // i일차의 상담시간이 총일수보다 작아야 함
                dp[i] = Math.max(dp[i + 1], pi[i] + dp[i + ti[i]]);     // i일차 다음날 수익이 큰가, i일차 상담하고 ti[i]일 지나고 수익이 큰가
            } else {
                dp[i] = dp[i + 1];                                      // i일차의 상담시간이 총일수보다 크면 i일차 수익 = i일차 다음날 수익 
                                                                        // (i일차에 상담 안하니깐 다음날꺼 고려. 거기서도 안하면 또 다음날꺼 고려.)
            }
        }

        System.out.println(dp[0]);

    }
}
