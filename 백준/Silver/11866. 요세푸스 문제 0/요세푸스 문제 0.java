import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            queue.add(i+1);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("<");

        while(queue.size() > 0) {
            for(int i = 0; i < K-1; i++) {
                queue.add(queue.poll());
            }

            String third = queue.poll().toString();

            if(queue.size() > 0) {
                sb.append(third + ", ");
            } else {
                sb.append(third);
            }
        }

        sb.append(">");

        System.out.println(sb);

    }

}
