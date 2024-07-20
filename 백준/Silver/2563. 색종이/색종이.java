import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];

        for(int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");

            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);

            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }

        int totalArea = 0;

        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    totalArea++;
                }
            }
        }
        
        System.out.println(totalArea);

    }
}
