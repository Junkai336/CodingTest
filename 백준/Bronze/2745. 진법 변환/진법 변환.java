import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");
        String n = st[0];
        int b = Integer.parseInt(st[1]);

        int result = 0;
        for(int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            int digit = Character.isDigit(c) ? c - '0' : c - 'A' + 10;
            result = result * b + digit;
        }

        System.out.println(result);

    }
}