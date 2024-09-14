import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] P = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P);     // 시간이 적게 걸리는 사람부터 처리하면 누적 총 대기시간을 줄일 수 있음

        int total = 0;
        int sum = 0;

        for (int i = 0; i < P.length; i++) {
            sum += P[i];    // 1 2 3 3 4
            total += sum;   // 1 3 6 9 13
        }

        System.out.println(total);
    }
}