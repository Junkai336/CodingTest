import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int H;
    static int W;
    static int[] directionH = new int[] { -1, 0, 1, 0 }; // 상우하좌
    static int[] directionW = new int[] { 0, 1, 0, -1 }; // 상우하좌
    static char[][] grid;
    static boolean[][] visited;
    static int groupCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            grid = new char[H][W];
            visited = new boolean[H][W];

            for (int j = 0; j < H; j++) {
                String element = br.readLine();

                for (int k = 0; k < W; k++) {
                    grid[j][k] = element.charAt(k);
                }
            }

            groupCount = 0;

            for (int j = 0; j < H; j++) {
                for (int k = 0; k < W; k++) {
                    if (grid[j][k] == '#' && !visited[j][k]) {
                        dfsWithStack(j, k);
                        groupCount++;
                    }
                }
            }

            sb.append(groupCount).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void dfsWithStack(int y, int x) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] { y, x });
        visited[y][x] = true;

        while (!stack.isEmpty()) {
            int[] node = stack.pop();

            for (int i = 0; i < 4; i++) {
                int nodeY = node[0] + directionH[i];
                int nodeX = node[1] + directionW[i];

                if (nodeX >= 0 && nodeY >= 0 && nodeX < W && nodeY < H) {
                    if (!visited[nodeY][nodeX] && grid[nodeY][nodeX] == '#') {
                        visited[nodeY][nodeX] = true;
                        stack.push(new int[] { nodeY, nodeX });
                    }
                }
            }
        }
    }
}
