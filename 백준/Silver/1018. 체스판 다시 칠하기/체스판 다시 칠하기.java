import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] array = new String[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < M; j++) {
                array[i][j] = String.valueOf(line.charAt(j));
            }
        }

        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < N - 7; i++) { // 8x8 크기로 시작하려면 체스판의 최대 크기보다 8칸 앞에 있어야 함
            for (int j = 0; j < M - 7; j++) {
                for (int k = 0; k < 2; k++) {
                    String start = k == 0 ? "W" : "B";

                    int count = 0;

                    for (int n = i; n < i + 8; n++) {
                        for (int m = j; m < j + 8; m++) {
                            if ((n + m) % 2 == 0 && !array[n][m].equals(start)) {
                                count++;
                            }
                            if ((n + m) % 2 == 1 && array[n][m].equals(start)) {
                                count++;
                            }
                        }
                    }

                    minCount = Math.min(minCount, count);
                }
            }
        }

        System.out.println(minCount);

    }
}