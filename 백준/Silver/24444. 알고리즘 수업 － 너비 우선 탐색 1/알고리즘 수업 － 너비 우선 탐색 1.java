import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int[] order; // 배열의 초기값은 0이니까 방문 안했으면 count++이 안들어감
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");

        int N = Integer.parseInt(st[0]); // 정점 수
        int M = Integer.parseInt(st[1]); // 간선 수
        int R = Integer.parseInt(st[2]); // 시작 정점

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[N + 1];
        order = new int[N + 1];

        for (int i = 1; i <= M; i++) {
            st = br.readLine().split(" ");

            int u = Integer.parseInt(st[0]);
            int v = Integer.parseInt(st[1]);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        bfs(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(order[i]);
        }

    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;
        order[start] = count++;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    order[next] = count++;
                }
            }

        }
    }
}
