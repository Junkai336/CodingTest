import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int x = Integer.parseInt(st[0]);
        int y = Integer.parseInt(st[1]);
        int w = Integer.parseInt(st[2]);
        int h = Integer.parseInt(st[3]);

        int outmin = Math.min(w-x, h-y);
        int inmin = Math.min(x, y);
        int totalmin = Math.min(outmin, inmin);

        System.out.println(totalmin);

    }
}