import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 소수 : 1과 자기 자신만을 약수로 가지는 자연수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());
            sb.append(findNextPrime(N)).append("\n");
        }

        System.out.println(sb);
    }

    public static String findNextPrime(long N) {
        if(N <= 1) return String.valueOf(2);

        while (!isPrime(N)) {
            N++;
        }

        return String.valueOf(N);
    }

    public static boolean isPrime(long N) {
        if(N <= 1) return false;
        if(N == 2 || N == 3) return true;
        if(N % 2 == 0 || N % 3 == 0) return false;

        long sqrt = (long) Math.sqrt(N) +1;                         // Math.sqrt가 Double 반환 정확히 정수로 떨어지지 않으므로 +1

        for(long i = 5; i <= sqrt; i += 6) {                        // 모든 소수는 6의 배수에서 +-1 위치에 있을 수 없음
            if(N % i == 0 || N % (i + 2) == 0) return false;        // 5기준으로 6의 배수에서 1작은 수, 1큰 수로 비교 
        }

        return true;
    }

}