import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] count = new int[3];
    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < N; j++) {
                int item = Integer.parseInt(st.nextToken());
                paper[i][j] = item;
            }
        }

        divide(0, 0, N);

        System.out.println(count[0]);
        System.out.println(count[1]);
        System.out.println(count[2]);
    }

    public static void divide(int x, int y, int size) {
        if (sameColorCheck(x, y, size)) {
            count[paper[x][y] + 1]++; // -1 -> 0번 인덱스, 0 -> 1번 인덱스, 1 -> 2번 인덱스
            return;
        }

        int newSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divide(x + i * newSize, y + j * newSize, newSize);
            }
        }
    }

    public static boolean sameColorCheck(int x, int y, int size) {
        int color = paper[x][y];
        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(paper[i][j] != color) return false;
            }
        }

        return true;
    }
}