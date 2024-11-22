import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];   // 값
        int[] dp = new int[N];      // 수열 길이 (최초 자기자신, 1)

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                // 이전꺼랑 순차적으로 비교해서 현재값이 더 크면 수열길이(dp) 비교해서 +1씩 함
                if(array[j] < array[i]) dp[i] = Math.max(dp[i], dp[j] +1);
            }
        }

        int maxLength = 0;
        for (int i = 0; i < dp.length; i++) {
            maxLength = Math.max(dp[i], maxLength);
        }

        System.out.println(maxLength);
    }
}
