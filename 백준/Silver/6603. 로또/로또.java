import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    /*
        입력
            맨 처음은 k
            그 다음은 집합 S에 포함되는 원소들
            마지막에 0으로 종료

            k : 로또 번호 선택하는데 사용되는 수
            S : k에 포함되는 수의 집합

            테스트 케이스마다 빈줄을 출력해야 하기 때문에 첫줄 아니면 끝나고 개행해야 함
        출력
            테스트 케이스마다 6개의 길이의 수의 모든 조합 출력 (오름차순)

        방식
            0.입력 7 1 2 3 4 5 6 7로 테스트

            1.오름차순 정렬
            2.파라미터 start랑 depth로 나눔
            
            3.맨 바깥 for문 돌 때 처음에 i가 0일 때 [1] 들어가고 i가 0일 때 dfs문이 계속 돌음 [1] [1,2] [1,2,3,4,5,6]
            4.맨 바깥 for문의 i가 0일 때 dfs문으로 재귀가 계속 도는데 거기서 또 for문 돌고 [1,2,3,4,5,6] 순서대로 들어가서 depth가 6이 되면 출력함

            5.[1,2,3,4,5,6] 배열이 채워졌을 때 맨 마지막에 실행된 for문이 [1,2,3,4,5] 니까 거기서 for문 i++ 되면서 [1,2,3,4,5,7]이 되는 거임
            5-2.k는 7이니까 for문이 7번 돌아야 함.
            5-3.depth가 4인 상태에서 [1,2,3,4,5]가 되고 depth가 5가 되며 거기서 for문 i가 5인데 i++돼서 i가 6일 때 [1,2,3,4,5,6] 보내고 i++ 돼서 i가 7이 돼서 [1,2,3,4,5,7]이 되는 거임
                (이게 visited 배열 안쓰니까 for문이 계속 돌 수 있는 거임)

            6.이런 원리로 Arrays.sort로 오름차순 배열한 배열이 반복해서 돌 수 있음
            7.다 돌면 맨 바깥쪽 for문으로 돌아와서 [2] 부터 넣음

        설명
            start = 집합 S 인덱스
            depth = 조합을 몇개 뽑았는지? (배열 길이가 몇인지?)

            중복 순열 ([1,2] [2,1])이 나오면 안되므로 dfs 파라미터가 2개임
     */
    static int[] S;
    static int[] result = new int[6];
    static int k;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        boolean first = true;

        while ((line = br.readLine()) != null) {
                if(line.trim().isEmpty()) continue;

                String[] inputs = line.split(" ");

                k = Integer.parseInt(inputs[0]);

                if(k == 0) break;
                if(!first) sb.append("\n");
                first = false;

                S = new int[k];

                for (int i = 0; i < k; i++) {
                    S[i] = Integer.parseInt(inputs[i + 1]);
            }

                Arrays.sort(S);

                dfs(0, 0);

            }

            System.out.println(sb.toString());
        }

        public static void dfs(int start, int depth) {
            if(depth == 6) {
                for(int i = 0; i < 6; i++) {
                    sb.append(result[i] + " ");
                }
                sb.append("\n");
                return;
            }

            for(int i = start; i < k; i++) {
                result[depth] = S[i];
                dfs(i + 1, depth + 1);
            }
        }
    }