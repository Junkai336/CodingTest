import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 이항 계수: 두 수 n, k가 주어질 때 n개의 원소 중 k개의 원소를 선택하는 방법의 수
            String[] st = br.readLine().split(" ");

            int N = Integer.parseInt(st[0]);
            int K = Integer.parseInt(st[1]);

            System.out.println(nk(N, K));
        }

        public static int nk(int N, int K) {
            if(K == 0 || K == N) return 1;

            return factorial(N) / (factorial(K) * factorial(N - K));
        }

        public static int factorial(int num) {
            int result = 1;
            
            for(int i = 1; i <= num; i++) {
                result *= i;
            }

            return result;
        }
    }