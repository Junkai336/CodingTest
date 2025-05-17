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

            0. start = 지금까지 몇개 골랐는가?
            0. i = 어떤 숫자를 선택할 것인가?
            
            1. 맨 처음 for문 돌 때 [1] 넣고 dfs(1) 호출
            2. dfs(1) 호출되면 visited[1]이 true니까 [1, 2]                     <start = 1> <i = 2>
            3. dfs(2) 호출되면 visited[1]과 visited[2]가 true니까 [1, 2, 3]     <start = 2> <i = 3>
            4. [1, 2, 3] 중 [3] 넣고 dfs(3) 호출
            5. start == N 이니까 배열 출력하고 return
            
            6. dfs(3)을 부른 dfs(2)의 뒤에 코드가 실행되어야 하니까 visited[3]를 false로 바꾸고 코드 종료
            7. dfs(2)에서 visited[2]를 false로 바꾸고 코드 종료
            8. dfs(1)의 for문에서 visited[1]하고 visited[2]는 if문 조건을 충족하지 않았으니까 이미 넘겼고, i가 3인 상태임
            9. 배열은 여전히 [1, 2, 3]인 상태
            10. dfs(1)에서 visited[3]가 false니까 [3] 넣고 dfs(2) 호출 = start가 1이니까 result[start], 즉 result[1]에 3 넣음 [1, 3]
            11. dfs(2)에서 visited[2]가 false니까 [1, 3, 2] 넣고 dfs(3) 호출

            ...

            12. dfs(1)은 for문 다 돌았으니까 dfs(0)으로 돌아가고 i가 2가 됨
            13. 반복

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
