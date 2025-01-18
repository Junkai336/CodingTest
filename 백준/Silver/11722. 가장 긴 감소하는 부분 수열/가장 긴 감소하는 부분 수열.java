import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 부분수열 : 원래 수열에서 일부 원소를 순서를 유지하며 선택한 수열
        // 감소수열 : 각 원소가 이전 원소보다 작아야 함
        // 30 - 20 - 10 길이 3

        int[] arr = new int[n];         // [10, 30, 10, 20, 20, 10]
        int[] dp = new int[n];          // [1, 1, 2, 2, 2, 3]

        String[] st = br.readLine().split(" ");
        for (int i = 0; i < st.length; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }

        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {           // 현재 원소
            for (int j = 0; j < i; j++) {       // 이전 원소
                if (arr[j] > arr[i]) {          // 앞의 원소가 뒤의 원소보다 커야 한다
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }
}
