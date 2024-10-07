import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            deque.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();

        int currentBall[] = deque.pollFirst();
        sb.append(currentBall[0]).append(" ");  // 순번

        while(!deque.isEmpty()) {
            int move = currentBall[1];      // 값

            if(move > 0) {
                for(int i = 0; i < move-1; i++) {   // 덱에서 빠진 상태로 n칸 이동해야하니까 n-1칸
                    deque.addLast(deque.pollFirst());
                }
                currentBall = deque.pollFirst();
            } else {
                for(int i = 0; i < Math.abs(move)-1; i++) {
                    deque.addFirst(deque.pollLast());
                }
                currentBall = deque.pollLast();
            }

            sb.append(currentBall[0]).append(" ");
        }

        System.out.println(sb);

    }
}