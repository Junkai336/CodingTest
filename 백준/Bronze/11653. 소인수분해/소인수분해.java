import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 소인수: 1보다 큰 정수 중 특정 수로 나누어 떨어지면, 그 수는 소인수임
        // 소인수분해: 대상이 되는 수를 소수들로만 나누어 그 수를 표현하는 것 
        // 합성수: 소수들의 곱으로 합쳐져서 이루어진 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        if(N != 1) {
            System.out.println(N);
        }

    }
}