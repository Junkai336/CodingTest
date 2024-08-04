import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int E = Integer.parseInt(st[0]); // <= 15
        int S = Integer.parseInt(st[1]); // <= 28
        int M = Integer.parseInt(st[2]); // <= 19

        int e = 0;
        int s = 0;
        int m = 0;

        int cnt = 0;

        while(true) {
            e++;
            s++;
            m++;

            if(e == 16) e = 1;
            if(s == 29) s = 1;
            if(m == 20) m = 1;

            cnt++;

            if(E == e && S == s && M == m) break;
        }

        System.out.println(cnt);

    }
}