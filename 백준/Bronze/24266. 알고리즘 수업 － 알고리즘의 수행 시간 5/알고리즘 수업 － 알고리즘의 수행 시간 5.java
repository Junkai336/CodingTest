import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] st = br.readLine().split(" ");

            long n = Long.parseLong(st[0]);

            System.out.println(n * n * n);
            System.out.println(3);
        }
    }