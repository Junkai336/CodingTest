import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] st = br.readLine().split(" ");

            int n = Integer.parseInt(st[0]);

            System.out.println(factorial(n));
        }

        public static long factorial(int n) {
            if (n <= 1) return 1;
            return n * factorial(n-1);
        }
    }
