import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> documentQueue = new LinkedList<>();
            Integer[] priority = new Integer[N];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int importance = Integer.parseInt(st.nextToken());

                documentQueue.offer(new int[]{j, importance});
                priority[j] = importance;
            }

            Arrays.sort(priority, (a, b) -> b - a);

            int count = 0;

            while (true) {
                int[] current = documentQueue.poll();

                int currentIdx = current[0];
                int currentImportance = current[1];

                if (currentImportance == priority[count]) {
                    count++;

                    if (currentIdx == M) {
                        System.out.println(count);
                        break;
                    }
                } else {
                    documentQueue.offer(current);
                }
            }
        }
    }
}