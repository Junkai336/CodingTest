import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            배열 크기 + 배열에 담긴 숫자

        출력
            배열에 들어있는 수 순서 바꿔서 최대값

        방식
            [1, 2, 3, 4, 5, 6] 차이합 구하고 visited false 만들고 [2, 3, 4, 5, 6, 1] 차이합 구하고 visited false 만들고 [3, 4, 5, 6, 1, 2] 차이합 구하고 반복 
            (배열 완성되면 차이합 구하고 맥스값인지 비교하고 return)

        설명
            숫자 배열이 [1, 2, 3, 4, 5, 6] 일 때 차이합은 [1-2] [2-3] [3-4] [4-5] [5-6] 이고 1 + 1 + 1 + 1 + 1 = 5
            근데 차이합이 가장 큰 배열이 [3-5] + [5-1] + [1-6] + [6-2] + [2-4] = 2 + 4 + 5 + 4 + 2
            = 17
     */

    static int[] arr;
    static int[] tempArr;
    static boolean[] visited;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] inputArr = br.readLine().split(" ");

        arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        visited = new boolean[N];
        tempArr = new int[N];

        dfs(0);

        System.out.println(max);

    }

    public static void dfs(int index) {
        if (index == arr.length) {
            int sum = 0;
            for (int i = 0; i < tempArr.length - 1; i++) {
                sum += Math.abs(tempArr[i] - tempArr[i + 1]);
            }
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                tempArr[index] = arr[i];

                dfs(index + 1);

                visited[i] = false;
            }
        }
    }
}