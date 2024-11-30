import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] count = new int[3];
    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] length = new long[N];

        long max = 0;
        for (int i = 0; i < K; i++) {
            long item = Long.parseLong(br.readLine());

            length[i] = item;
            if (item > max)
                max = item;
        }

        long result = binarySearch(length, max, N);

        System.out.println(result);
    }

    public static long binarySearch(long[] length, long max, int N) {

        long left = 1;
        long right = max; // 구하려는 값은 최대 길이임

        long result = 0;
        while (left <= right) {
            long mid = (left + right) / 2;

            if (make(mid, length, N)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static boolean make(long mid, long[] length, int N) {
        long count = 0;
        for (int i = 0; i < length.length; i++) {
            count += length[i] / mid;
        }

        return count >= N;
    }
}
