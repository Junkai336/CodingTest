import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int N = Integer.parseInt(st[0]);    // 총 칸
        int M = Integer.parseInt(st[1]);    // 바구니 칸

        int J = Integer.parseInt(br.readLine());    // 사과 개수
        int[] j = new int[J];

        for(int i = 0; i < J; i++) {
            j[i] = Integer.parseInt(br.readLine()); // 사과
        }

        // 바구니 초기 칸 (1칸 ~ 넓이)
        int leftM = 1;
        int rightM = M;

        // 이동거리
        int movePoint = 0;

        for(int i = 0; i < j.length; i++) {
            // 사과가 좌측에 있는 경우 좌측으로 이동, 우측에 있는 경우 우측으로 이동
            // 그 외 이동거리 증가 X
            if(j[i] < leftM) {
                movePoint += leftM - j[i];
                leftM = j[i];
                rightM = leftM + M - 1;
            } else if(j[i] > rightM) {
                movePoint += j[i] - rightM;
                rightM = j[i];
                leftM = rightM - M + 1;
            }
        }

        System.out.println(movePoint);

    }
}