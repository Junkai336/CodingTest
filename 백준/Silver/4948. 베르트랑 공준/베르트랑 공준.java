import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 123456 * 2;
        boolean[] notPrime = new boolean[max + 1];
        notPrime[0] = notPrime[1] = true;

        for (int i = 2; i * i <= max; i++) {
            if(!notPrime[i]) {
                for(int j = i * i; j <= max; j += i) {
                    notPrime[j] = true;
                }
            }
        }

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) return;

            int primeCount = 0;
            for (int i = N + 1; i <= N * 2; i++) {
                if(!notPrime[i]) {
                    primeCount++;
                }
            }

            System.out.println(primeCount);
        }
    }
}