import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] temperatureArray = new int[N + 1];
        int[] preResult = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            temperatureArray[i] = Integer.parseInt(st.nextToken());
        }

        // 처음 범위값(K)에 대한 합
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += temperatureArray[i];
        }

        // 처음 합 가지고 계속 비교
        // for문 : 처음합은 구했으니까 K로 시작,
        // sum : 기존 합에서 + 다음 마지막 범위값 - 이전 마지막 범위값
        // Math.max : 현재 합과 이전 합 비교해서 더 크면 maxResult 변수에 저장
        int maxResult = sum;
        for (int i = K; i < N; i++) {
            sum = sum + temperatureArray[i] - temperatureArray[i - K];
            maxResult = Math.max(sum, maxResult);
        }

        System.out.println(maxResult);

    }
}
