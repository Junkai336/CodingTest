import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            String[] st = br.readLine().split(" ");

            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);

            System.out.println(combination(N, M));
        }
    }

    public static long combination(int N, int M) {
        // M개의 사이트 중 N개의 사이트를 선택
        // 조합 공식 존재

        // N == 0 N이 0일 때 아무것도 선택하지 않는 하나의 경우의 수만 존재
        // M == N 주어진 M개의 사이트가 N개의 사이트를 모두 선택하는 하나의 경우의 수만 존재
        if(N == 0 || M == N) return 1;

        int result = 1;

        for (int i = 1; i <= N; i++) {
            result = result * (M - i + 1) / i;
        }

        return result;
    }

}