import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] studentClass = new int[N][5];

        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                studentClass[i][j] = Integer.parseInt(st[j]);
            }
        }

        int maxSameClassCnt = 0;
        int presidentStudentNumber = 0;

        for (int i = 0; i < N; i++) { // 학생
            int sameClassCnt = 0;

            for (int j = 0; j < N; j++) { // 다른 학생
                if (i == j) continue; // 자기 자신

                for (int k = 0; k < 5; k++) { // 학년
                    if (studentClass[i][k] == studentClass[j][k]) {
                        sameClassCnt++;
                        break;
                    }
                }
            }

            if (sameClassCnt > maxSameClassCnt) {
                maxSameClassCnt = sameClassCnt;
                presidentStudentNumber = i;
            } else if (sameClassCnt == maxSameClassCnt) {
                presidentStudentNumber = Math.min(presidentStudentNumber, i);
            }
        }

        System.out.println(presidentStudentNumber + 1);
    }
}