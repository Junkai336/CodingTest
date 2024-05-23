import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int X = Integer.parseInt(st[0]);
        int Y = Integer.parseInt(st[1]);

        System.out.println(Rev(Rev(X) + Rev(Y)));
    }

    public static int Rev(int num) {
        String rev = new StringBuilder(String.valueOf(num)).reverse().toString();

        return Integer.parseInt(rev);
    }

}