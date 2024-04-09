import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int atleastmultitab = N - 1;

        int total = 0;

        for(int i = 0; i < N; i++) {
            total += Integer.parseInt(br.readLine());
        }

        System.out.println(total - atleastmultitab);
    }
}