import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static int computer, networkCount;
    static boolean[] visited;
    static HashMap<Integer, ArrayList<Integer>> network = new HashMap<>();
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        computer = Integer.parseInt(br.readLine());
        networkCount = Integer.parseInt(br.readLine());
        visited = new boolean[computer + 1];

        for (int i = 1; i <= computer; i++) {
            network.put(i, new ArrayList<>());
        }

        for(int i = 0; i < networkCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            network.get(a).add(b);
            network.get(b).add(a);
        }

        wormVirus(1);

        System.out.println(count - 1);

    }

    static void wormVirus(int start) {
        visited[start] = true;
        count++;

        for (int next : network.get(start)) {
            if (!visited[next]) {
                wormVirus(next);
            }
        }


    }
}
