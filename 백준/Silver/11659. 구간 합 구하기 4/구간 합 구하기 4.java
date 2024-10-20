import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // for문을 2번 돌리면 O(N^2) 이므로 시간 초과남

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N +1];
        int[] prefixSum = new int[N +1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {                        // 인덱스 0번째는 0임
            arr[i] = Integer.parseInt(st.nextToken());
            prefixSum[i] = prefixSum[i - 1] + arr[i];        // 누적 합 계산
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            sb.append(prefixSum[J] - prefixSum[I - 1]).append("\n");    // 인덱스 0번째가 0이니까 1 3 제대로 구해짐
        }

        System.out.println(sb);
    }
}