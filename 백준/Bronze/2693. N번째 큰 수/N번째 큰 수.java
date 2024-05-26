import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int[] num = new int[10];

            String[] st = br.readLine().split(" ");

            for(int j = 0; j < 10; j++) {
                num[j] = Integer.parseInt(st[j]);
            }

            Arrays.sort(num);
            System.out.println(num[7]);
        }
    }
}