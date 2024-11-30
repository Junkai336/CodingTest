import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());   // 집에 가져가려고 하는 나무 길이 (절단기 높이 15m면 20 15 10 17 -> 5 0 0 2 = 7)
        long[] treeHeight = new long[N];

        long maxHeight = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long item = Long.parseLong(st.nextToken());

            treeHeight[i] = item;
            if (item > maxHeight)
                maxHeight = item;
        }

        long result = binarySearch(treeHeight, maxHeight, M);

        System.out.println(result);
    }

    public static long binarySearch(long[] treeHeight, long maxHeight, int M) {
        long left = 0;          // 절단기 최소 높이
        long right = maxHeight; // 구하려는 값은 절단기 최대 높이

        long result = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            long wood = make(mid, treeHeight);

            if (wood >= M) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static long make(long mid, long[] treeHeight) {
        long totalWood  = 0;
        for (int i = 0; i < treeHeight.length; i++) {
            if(treeHeight[i] > mid) totalWood += treeHeight[i] - mid;
        }

        return totalWood;
    }
}