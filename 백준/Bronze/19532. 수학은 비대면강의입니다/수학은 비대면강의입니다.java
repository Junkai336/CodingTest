import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        int c = Integer.parseInt(st[2]);

        int d = Integer.parseInt(st[3]);
        int e = Integer.parseInt(st[4]);
        int f = Integer.parseInt(st[5]);

        for(int i = -999; i < 1000; i++) {
            for(int j = -999; j < 1000; j++) {
                if((a*i + b*j == c) && (d*i + e*j == f)) System.out.println(i + " " + j);
            }
        }
    }
}