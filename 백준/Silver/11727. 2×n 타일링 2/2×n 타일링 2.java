import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < dp.length; i++) {
            dp[i] = (dp[i-1] + (dp[i-2] * 2)) % 10007;
        }

        System.out.println(dp[n]);

        // n이 1일 때 1가지     
        // n이 2일 때 3가지     3-2= 1      
        // n이 3일 때 5가지     5-3= 2      n이 1일때 1가지 *2
        // n이 4일 때 11가지    11-5= 6     n이 2일때 3가지 *2
        // n이 5일 때 21가지    21-11= 10   n이 3일때 5가지 *2

    }
}
