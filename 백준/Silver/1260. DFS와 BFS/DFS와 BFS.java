import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int N, M, V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());       // 정점 개수
        M = Integer.parseInt(st.nextToken());       // 간선 개수
        V = Integer.parseInt(st.nextToken());       // 탐색 시작 정점

        // 그래프 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 그래프 간선 추가
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int linked = Integer.parseInt(st.nextToken());
            int linked2 = Integer.parseInt(st.nextToken());

            graph.get(linked).add(linked2);
            graph.get(linked2).add(linked);
        }

        // 그래프 인접 리스트 오름차순 정렬
        for(int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        // DFS
        visited = new boolean[N + 1];
        dfs(V);
        System.out.print("\n");

        // BFS
        visited = new boolean[N + 1];
        bfs(V);
    }

    public static void dfs(int node) {
        System.out.print(node + " ");
        visited[node] = true;

        // get(1)이 2,3,4를 가지고 있으니까 node=2 get(2)가 4를 가지고 있으니까 node=4 get(4)가 3을 가지고 있으니까 node=3 => 1 2 4 3
        for(int next : graph.get(node)) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        // start가 1이면 1 방문 표시시키고 1이 2 3 4 가지고 있으니까 순서대로 2 3 4 출력하고 방문 표시
        while(!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            for(int next : graph.get(currentNode)) {
                if(!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }

        }
    }

}