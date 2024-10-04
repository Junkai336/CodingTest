import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int currentCount = 1;

        while (!queue.isEmpty() || !stack.isEmpty())
            if (!queue.isEmpty() && currentCount == queue.peek()) {
                currentCount++;
                queue.poll();
            } else if (!stack.isEmpty() && currentCount == stack.peek()) {
                currentCount++;
                stack.pop();
            } else if(!queue.isEmpty()) {
                stack.push(queue.poll());
            } else {
                System.out.println("Sad");
                return;
            }

            System.out.println("Nice");

    }
}