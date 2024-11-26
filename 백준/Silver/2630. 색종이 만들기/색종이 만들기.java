import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int whiteCount = 0;
    static int blueCount = 0;
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

        System.out.println(whiteCount);
        System.out.println(blueCount);
    }

    public static void divide(int x, int y, int size) {
        if(sameColorCheck(x, y, size)) {
            if(paper[x][y] == 1) {
                blueCount++;
            } else {
                whiteCount++;
            }
            return;
        }

        int newSize = size / 2;

        divide(x, y, newSize);
        divide(x+newSize, y, newSize);
        divide(x, y+newSize, newSize);
        divide(x+newSize, y+newSize, newSize);
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