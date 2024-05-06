import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        Long n = Long.parseLong(st[0]);

        System.out.println((n-2) * (n-1) * n / 6);
        System.out.println(3);
        }
    }