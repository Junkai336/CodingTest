import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");
        int[] num = new int[5];

        for(int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(st[i]);
        }

        int a = 1;

        while (true) {
            int count = 0;
            for(int i = 0; i < 5; i++) {
                if (a % num[i] == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                break;
            }
            a++;
        }

        System.out.println(a);
        br.close();

    }

}