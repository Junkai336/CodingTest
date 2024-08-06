import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();                  // 선입선출 (먼저 삽입된 요소가 제거)

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder discarded = new StringBuilder();

        for(int i = 0; i < N-1; i++) {                              // 맨마지막 요소는 queue.add 할 게 없으므로 제외 (N-1)
            discarded.append(queue.poll()).append(" ");         // queue.poll = 제일 앞에 있는 요소가 제거되고 제거된 요소가 반환

            queue.add(queue.poll());                                // 제일 앞에 있는 요소 제거 후 맨 뒤로 붙임
        }

        discarded.append(queue.poll());                             // 마지막 요소

        System.out.println(discarded.toString());

    }
}