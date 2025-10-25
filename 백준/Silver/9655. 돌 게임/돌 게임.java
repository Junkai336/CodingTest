import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            돌 개수 N

        출력
            홀sk, 짝cy

        방식
            1.배열에 돌 개수만큼 작은 문제 배열에 저장해놓음 (계속 1개씩 가져갈 수도 있으니까 ㅇㅇ)
            2.지금 턴이 짝수고, 다음 턴이 홀수면 짝수 턴인 사람이 이김


        설명
            돌 1개 또는 3개 가져갈 수 있는데,
            여기서 홀수면 SK, 짝수면 CY가 이기는 걸로 확정인데.

            다이나믹 프로그래밍으로 어케 푸는지 생각해야 함...

            - 큰 문제를 작은 문제로 쪼개서 푸는 기법
            - 모든 작은 문제들은 단 한번만 풀어야 함
            - 정답을 구한 작은 문제의 결과는 따로 배열 같은 곳에 저장하고 다시 필요할 때 사용함 (메모이제이션)

            => 승부가 홀짝으로만 결정되니까 승부 결과를 저장하면 됨

            
     */
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] dp = new String[Math.max(4, N + 1)];   // 배열 크기가 4보다 작으면 N이 dp[3]=4 보다 작을 때 배열인덱스 없어서 오류남

        dp[1] = "SK";
        dp[2] = "CY";
        dp[3] = "SK";

        for (int i = 4; i <= N; i++) {
            if (dp[i - 1].equals("CY") || dp[i - 3].equals("CY")) {
                dp[i] = "SK";
            } else {
                dp[i] = "CY";
            }
        }
        
        System.out.println(dp[N]);

    }
}