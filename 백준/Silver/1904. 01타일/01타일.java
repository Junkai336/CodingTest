import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1             1개
        // 11 00         2개
        // 110 001 100   3개 (1+2개)
        // 1100 0011 1111 1001 0000  5개 (2+3개)
        // 11001 11100 10011 10000 00001 00100 00111 11111 (3+5개)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 0;

        if(N == 1 || N == 2) {
            result = N;
            System.out.println(result % 15746);
            return;
        } 

        int[] array = new int[N + 1];

        array[1] = 1;
        array[2] = 2;

        for(int i = 3; i <= N; i++) {
            array[i] = (array[i-1] + array[i-2]) % 15746;
        }

        System.out.println(array[N]);
    }
}