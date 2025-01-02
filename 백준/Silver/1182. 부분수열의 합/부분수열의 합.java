import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, S;
    static int[] array;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        array = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        sumCount(0, 0);

        if(S == 0) {
            count--;
        }

        System.out.println(count);
    }

    public static void sumCount(int index, int sum) {
        if (index == N) {
            if (sum == S) count++;
            return;
        }

        // 다음 원소로 이동
        sumCount(index + 1, sum);

        // 합계 + 현재 인덱스의 값하고 다음 원소로 이동
        sumCount(index + 1, sum + array[index]);
    }
}