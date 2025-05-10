import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            배열 크기 + [몸무게, 키]

        출력
            등수 (SQL RANK()같은 방식), 같은 등수를 인정하고 예를 들어 3등이 2등이면 4등은 4등으로 출력)

        방식
            같은 배열에서 for문 2번 돌림.
            [1,2,3,4,5] 일 때 [1] 일 때 [1,2,3,4,5]랑 비교해서 [1]이 [2]보다 작으니까 등수 +1 ~> 5등
            다시 for문 i로 돌아와서 등수 초기화 한 뒤 j랑 비교해서 등수 다시 매김
            (= 초기화 해서 일일이 다시 매기는 방식임)

        설명
            if문이 키,몸무게 둘 다 비교받는 대상이 크면 cnt가 증가하니깐
            키,몸무게 둘 중 하나라도 비교하는 대상이 크면 덩치가 같다고 판단해서 등수 증가 안함
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(input[0]); // 몸무게
            arr[i][1] = Integer.parseInt(input[1]); // 키
        }

        int[] rank = rank(arr, N);

        for(int i = 0; i < rank.length; i++) {
            System.out.print(rank[i] + " ");
        }
    }

    public static int[] rank(int[][] arr, int N) {
        int[] rank = new int[N];

        for(int i = 0; i < arr.length; i++) {
            int cnt = 1;

            for(int j = 0; j < arr.length; j++) {
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    cnt++;
                }
            }
            rank[i] = cnt;
        }

        return rank;
    }
}