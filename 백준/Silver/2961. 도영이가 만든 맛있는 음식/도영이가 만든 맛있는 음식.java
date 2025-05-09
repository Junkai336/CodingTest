import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
        입력
            재료개수 + 재료의신맛쓴맛

        출력
            쓴맛의 합 - 신맛의 곱의 최솟값

        방식
            모든 조합을 다 찾아서 쓴맛의 합 - 신맛의 곱을 구해야 하는데 (1,2,3) 이면 (1)에서 (1) 포함하는 경우 + (1) 포함 안하는 경우 나눠서 계속 돌림
            (1,2,3) (1)포함         =>  (1) (1,2) (1,3) (1,2,3)
            (1,2,3) (1)포함안함     =>  (2) (2,3) (2)
                                    => (3)

        설명
            재료가 4개여도 차이가 제일 적은 1개를 선택할 수 있음
            그니까 부분집합에서 차이값이 제일 적은 놈 고르는 거임

            부분집합 : 각 원소를 포함할지 말지 판단해서 만들 수 있는 모든 조합 (a, b) (a, c) (b, c) (a, b, c) (a) (b) (c) ()
            순열 : 원소를 나열하는 모든 방법 (a, b, c) (a, c, b) (b, a, c) (b, c, a) (c, a, b) (c, b, a)
     */
    static int N;
    static int[][] arr;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());   // 신맛(s)
            arr[i][1] = Integer.parseInt(st.nextToken());   // 쓴맛(b)
        }

        dfs(0, 1, 0, 0);

        System.out.println(min);
    }

    public static void dfs(int index, int s, int b, int selectedCnt) {
        if (index == N) {
            if (selectedCnt == 0) return;
            min = Math.min(min, Math.abs(s - b));
            return;
        }

        dfs(index + 1, s * arr[index][0], b + arr[index][1], selectedCnt + 1);
        dfs(index + 1, s, b, selectedCnt);

    }
}