import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int man1;
    static int man2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 전체 사람의 수 (정점)

        StringTokenizer st = new StringTokenizer(br.readLine());
        man1 = Integer.parseInt(st.nextToken()); // 촌수 계산해야 하는 사람
        man2 = Integer.parseInt(st.nextToken()); // 촌수 계산해야 하는 사람

        int m = Integer.parseInt(br.readLine()); // 부모 자식들 간 관계 개수 (간선)

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        visited = new boolean[n + 1];

        dfs(man1, 0);

        System.out.println(-1);

    }

    public static void dfs(int node, int depth) {
        visited[node] = true;

        if(node == man2) {
            System.out.println(depth);
            System.exit(0);
        }

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next, depth + 1);
            }
        }

    }
}
