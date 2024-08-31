import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long gcd = gcd(A, B);

        long result = (A * B) / gcd;

        System.out.println(result);

    }

    // 최대 공배수를 구하려면 두 수의 곱을 최대 공약수(GCD)로 나눠야 함
    // 유클리드 호제법
    public static long gcd(long A, long B) {
        if(B == 0) return A;

        return gcd(B, A % B);
    }
}