import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]) -1;
            int b = Integer.parseInt(st[1]) -1;

            int x = Math.abs((a/4) - (b/4));
            int y = Math.abs((a%4) - (b%4));

            System.out.println(x + y);
    }
}