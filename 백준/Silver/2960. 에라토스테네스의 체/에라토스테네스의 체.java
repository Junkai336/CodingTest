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

        boolean[] isPrime = new boolean[N+1];                               // 안지워진건 기본값 false, true면 지워졌다고 판단

        int cnt = 0;

        for(int i = 2; i <= N; i++) {
            if(!isPrime[i]) {                                               // 지워지지 않은 수인지 검사
                if(isPrime(i)) {                                            // 소수라면,
                    for(int j = i; j <= N; j += i) {                        // i의 배수를 지움 
                        if(!isPrime[j]) {                                   // i의 배수가 지워지지 않은 수면, (2, 4, 6)
                            cnt++;                                          
                            isPrime[j] = true;                              // 지움
                            if(cnt == K) {
                                System.out.println(j);                      // K번째로 지워진 수 표출 후 종료
                                break;
                            }
                        }
                    }
                }
            }
        }

    }

    public static boolean isPrime(int N) {
        if (N <= 1) return false;                       // 0,1 : 소수 x

        if (N == 2) return true;                        // 2 : 소수 o

        if (N % 2 == 0) return false;                   // 짝수 : 소수 x

        for (int i = 3; i < Math.sqrt(N); i += 2) {     // 숫자가 소수인지 판별할 때, 그 수의 약수는 반드시 그 수의 제곱근 이하에서 나타남, 짝수를 건너뛰고 홀수만 검사함
            if (N % i == 0) return false;               // 숫자가 i로 나누어 떨어지면 1과 자기자신만 약수로 가지는 소수가 아님
        }

        return true;
    }
}