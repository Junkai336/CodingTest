import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    /*
        입력
            N개의 서로 다른 정수
            길이 M개를 골라 순서 있게 나열

        출력
            배열 N에서 M개 만큼 뽑아서 수열 만들기 (오름차순)

        방식
            오름차순으로 해야하니까 Arrays.sort()로 정렬
            길이가 M인 상태에서 순열 만드는 거니까 result 배열은 M 크기가 맞음
            for문은 N 크기만큼 도는 이유가 N개의 서로 다른 정수에서 뽑아야 하기 때문임
            대신에 dfs는 M의 크기만큼 도는데 출력 배열은 M 크기여야 하기 때문임 (N=3 M=2면 [1, 2], [1, 3], [2, 1], [2, 3], [3, 1], [3, 2])

        설명
            
     */
    static boolean[] visited;
    static int[] arr;
    static int[] result;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        String[] inputs = input.split(" ");
        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);

        visited = new boolean[N];
        arr = new int[N];
        result = new int[M];

        input = br.readLine();
        inputs = input.split(" ");
        for(int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(arr);

        dfs(0);

        System.out.println(sb.toString());
        }

        public static void dfs(int start) {
            if(start == M) {
                for(int i = 0; i < M; i++) {
                    sb.append(result[i] + " ");
                }
                sb.append("\n");
                return;
            }

            for(int i = 0; i < N; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    result[start] = arr[i];
                    dfs(start + 1);
                    visited[i] = false;
                }
            }
        }
    }