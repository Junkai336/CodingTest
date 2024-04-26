import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int layer = 0;
        int layerMax = 1;

        while(layerMax < N) {
            layer++;
            layerMax += 6 * layer;
        }

        System.out.println(layer+1);

    }
}
