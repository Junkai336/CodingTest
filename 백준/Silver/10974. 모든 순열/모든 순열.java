import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            1부터 N까지의 정수 中 N

        출력
            1부터 N까지의 순열 (사전순 오름차순 정렬)

        방식
            순열 완성되면 stringbuilder에 넣기
            1 -> 2 -> 3 = dfs(1)
            1 -> 3 -> 2 = dfs(2)
            2 -> 1 -> 3 = dfs(2)
            2 -> 3 -> 1 = dfs(2)

        설명
            N! : 팩토리얼 (1 * 2 * 3 * ... * N) => 1부터 N까지로 만들 수 있는 순열 총 개수
     */
    static boolean[] visited;
    static int[] arr;
    static int[] result;
    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        arr = new int[N];
        result = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        dfs(0);

        System.out.println(sb.toString());
        }

        public static void dfs(int start) {
            if(start == N) {
                for(int i = 0; i < N; i++) {
                    sb.append(result[i] + " ");
                }
                sb.append("\n");
                return;
            }

            for(int i = 1; i <= N; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    result[start] = i;
                    dfs(start + 1);
                    visited[i] = false;
                }
            }
        }
    }