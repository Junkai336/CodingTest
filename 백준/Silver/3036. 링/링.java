import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < array.length; i++) {
            int gcd = gcd(array[0], array[i]);
            System.out.println((array[0] / gcd) + "/" + (array[i] / gcd));
        }
    }

    // 최대 공약수 구하기
    public static int gcd(int a, int b) {
        if(b == 0) return a;

        return gcd(b, a % b);
    }
}