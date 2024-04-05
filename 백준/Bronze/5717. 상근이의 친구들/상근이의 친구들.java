import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String[] st = br.readLine().split(" ");
            int M = Integer.parseInt(st[0]);
            int N = Integer.parseInt(st[1]);
            if(M == 0 && N == 0) { break; }
            System.out.println(M + N);
        }
    }
}