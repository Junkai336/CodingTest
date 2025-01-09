import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int w;
    static int h;
    static int[] directionW = new int[] { -1, 0, 1, 1, 1, 0, -1, -1 };
    static int[] directionH = new int[] { 1, 1, 1, 0, -1, -1, -1, 0 };
    static int[][] square;
    static boolean[][] visited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken()); // 가로
            h = Integer.parseInt(st.nextToken()); // 세로

            if (w == 0 && h == 0)
                break;

            square = new int[h][w]; // 섬 크기
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    square[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            count = 0; // 섬 개수

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && square[i][j] == 1) {
                        dfsWithStack(i, j); // 여기서 ij랑 연관된 섬 모두 조회
                        count++; // 다음 방문했을 때 ij가 visited false면 연결되지 않은 다른 섬임
                    }
                }
            }

            sb.append(count).append("\n");

        }

        System.out.println(sb.toString());

    }

    public static void dfsWithStack(int x, int y) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] { x, y });
        visited[x][y] = true;

        while (!stack.isEmpty()) {
            int[] node = stack.pop();

            for (int i = 0; i < 8; i++) {
                int nodeX = node[0] + directionH[i];
                int nodeY = node[1] + directionW[i];

                if (nodeX >= 0 && nodeY >= 0 && nodeX < h && nodeY < w) {
                    if (!visited[nodeX][nodeY] && square[nodeX][nodeY] == 1) {
                        visited[nodeX][nodeY] = true;
                        stack.push(new int[] { nodeX, nodeY });
                    }
                }
            }

        }

    }
}
