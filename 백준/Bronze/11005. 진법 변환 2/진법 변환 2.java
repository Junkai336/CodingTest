import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);

        br.close();

        ArrayList<Character> list = new ArrayList<>();

        while (n > 0) {
            if(n % b < 10) {
                list.add((char) ((n % b + '0')));
            } else {
                list.add((char) (n % b - 10 + 'A'));
            }
            n /= b;
        }

        for (int i = list.size() -1; i >=0; i--) {
            System.out.print(list.get(i));
        }

    }
}