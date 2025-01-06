import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph; // arraylist 타입 배열
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        // 연결 요소 : 한 정점에서 다른 정점으로 모두 이동할 때 몇 개의 그룹으로 나뉠 수 있는가 (연결된 요소들이 몇 개의 그룹으로 나뉘는가)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 개수
        int M = Integer.parseInt(st.nextToken()); // 간선 개수

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 무방향 그래프 : a가 b로도 갈 수 있고 b가 a로 갈 수도 있음
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

    }

    public static void dfs(int node) {
        visited[node] = true;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }

    }
}
