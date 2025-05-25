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
            for문은 N 크기만큼 도는 이유가 N개의 정수를 뽑아야 하기 때문임
            대신에 dfs는 M의 크기만큼 도는데 출력 배열은 M 크기여야 하기 때문임 (N=3 M=2면 [1, 2], [1, 3], [2, 1], [2, 3], [3, 1], [3, 2])

            +

            visited 배열은 안 씀 (같은 수 여러번 골라도 되니까)
            대신에 start랑 depth 파라미터 사용함 (현재 배열 인덱스가 어딘지 봐야하기 때문에 start 사용) (depth는 지금 배열 길이)
            dfs에서 start 파라미터는 i+1이 아니라 i인데 그 이유가 같은 수 넣어야 하니까 그럼. for문이 start부터 돌고 배열 값은 depth에 넣어주니깐.

            +

            입력이 N = 4 4 2 이렇게 됐을 때 4는 한 번만 계산해서 출력해야 하니까 prev = arr[i]로 만들고 4를 처리한 뒤 다음 for문에서 prev가 4니까 중복이어서 처리하지 않음
            어차피 배열은 오름차순으로 들어감. 그러므로 이전 값이 중복인지 확인하고 stringbuilder에 안 들어가게 하면 됨

        설명
            같은 수 여러번 골라도 됨
            수열은 오름차순? (비내림차순이어야 함)
            입력은 중복이어도 되는데 출력은 중복이면 안됨
     */
    static int[] arr;
    static int[] result;
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        String[] inputs = input.split(" ");
        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);

        arr = new int[N];
        result = new int[M];

        input = br.readLine();
        inputs = input.split(" ");
        for(int i = 0; i < inputs.length; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(arr);

        dfs(0, 0);

        System.out.println(sb.toString());
        }

        public static void dfs(int start, int depth) {
            if(depth == M) {
                for(int i = 0; i < M; i++) {
                    sb.append(result[i] + " ");
                }
                sb.append("\n");
                return;
            }

            int prev = -1;
            for(int i = start; i < N; i++) {
                    if (arr[i] == prev) continue;
                    prev = arr[i];
                    
                    result[depth] = arr[i];
                    dfs(i, depth + 1);
            }
        }
    }