import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 예: 3! => 3 * 2 * 1
        // 2와 5가 곱해져 있을 때 뒷자리 0이 나오는 경우가 존재
        // 뒷자리가 0이 n개 있다는 의미는 2와 5가 n개씩 짝지어 존재함 (2 * 5 = 10) [그렇지 않은 경우도 있음]
        // 5배수마다 0이 증가

        int count = 0;

        for(int i = 5; i <= N; i *= 5) {
            count += N / i;
        }

        System.out.println(count);
    }
}