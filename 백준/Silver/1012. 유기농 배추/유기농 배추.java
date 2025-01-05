import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;
    static int[][] field;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken()); // 테스트 케이스

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()); // 가로 길이
            int N = Integer.parseInt(st.nextToken()); // 세로 길이
            int K = Integer.parseInt(st.nextToken()); // 배추가 심어져 있는 위치 개수

            field = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                field[x][y] = 1;
            }

            int groupCount = 0; // 배추 군집 수

            for (int j = 0; j < field.length; j++) {
                for (int k = 0; k < field[j].length; k++) {
                    if (field[j][k] == 1 && !visited[j][k]) {
                        dfs(j, k);
                        groupCount++;
                    }
                }
            }

            System.out.println(groupCount);

        }
    }

    public static void dfs(int x, int y) {
        if (x < 0 || x >= field.length || y < 0 || y >= field[x].length) {
            return;
        }

        if (field[x][y] == 1 && !visited[x][y]) {
            visited[x][y] = true;

            dfs(x, y + 1);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x - 1, y);
        }
    }
}
