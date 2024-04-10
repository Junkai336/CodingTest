import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int total = 0;

        for(int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int c = Integer.parseInt(st[2]);

            int sum = 0;
            if(a==b && b==c) {
                sum = 10000 + a * 1000;
            } else if (a==b || a==c || b==c) {
                if (a == b || a == c) {
                    sum = 1000 + a * 100;
                } else {
                    sum = 1000 + b * 100;
                }
            } else {
                sum = Math.max(a, Math.max(b, c)) * 100;
            }

            total = Math.max(total, sum);
        }

        System.out.println(total);
    }
}