import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A, (a, b) -> Integer.compare(a, b));
        Arrays.sort(B, (a, b) -> Integer.compare(b, a));

        int S = 0;

        for (int i = 0; i < N; i++) {
            S += A[i] * B[i];
        }

        System.out.println(S);

    }
}