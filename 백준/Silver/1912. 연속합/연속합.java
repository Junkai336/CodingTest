import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = array[0];
        int maxResult = dp[0];

        for(int i = 1; i < array.length; i++) {
            dp[i] = Math.max(dp[i-1] + array[i], array[i]);
            maxResult = Math.max(dp[i], maxResult);
        }

        System.out.println(maxResult);
    }
}
