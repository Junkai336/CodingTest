import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> X = new HashSet<>();
        Set<Integer> Y = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            String[] st = br.readLine().split(" ");
            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);

            if (!X.add(x)) {
                X.remove(x); 
            }
            if (!Y.add(y)) {
                Y.remove(y); 
            }
        }

        br.close();

        System.out.print(X.iterator().next() + " ");
        System.out.println(Y.iterator().next());

    }
}