import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        final int MAX = 1000000;
        boolean[] isPrime = new boolean[MAX + 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            if (N % 2 != 0 || N <= 2) {
                System.out.println(1);
                continue;
            }

            int count = 0;

            for(int j = 2; j <= N / 2; j++) {        // 순서만 다른 경우 다른 파티션, 그러므로 '절반만' 비교 / 1과 10을 비교하고 나중에 10과 1을 비교하게 됨
                if(isPrime[j] && isPrime[N - j]) {   // 예를 들어서 6은 3(소수) + 3(소수) ok , 2 + 4 소수 no
                    count++;
                }
            }

            System.out.println(count);

        }
    }
}