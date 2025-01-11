import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        parent = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i < N; i++) {
            String[] st = br.readLine().split(" ");

            int node = Integer.parseInt(st[0]);
            int node2 = Integer.parseInt(st[1]);

            graph.get(node).add(node2);
            graph.get(node2).add(node);
        }

        bfs(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }

    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = node;
                    queue.add(next);
                }
            }

        }
    }
}
