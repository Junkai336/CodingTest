import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            String st[] = br.readLine().split(" ");
            int A = Integer.parseInt(st[0]);
            int B = Integer.parseInt(st[1]);

            if(A == 0 && B == 0) return;

            if(B % A == 0) {
                System.out.println("factor");
                continue;
            }
            if(A % B == 0) {
                System.out.println("multiple");
                continue;
            }
            System.out.println("neither");
        }
    }
}