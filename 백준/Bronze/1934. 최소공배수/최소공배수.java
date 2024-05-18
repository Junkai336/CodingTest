import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String[] st = br.readLine().split(" ");

            int A = Integer.parseInt(st[0]);
            int B = Integer.parseInt(st[1]);

            System.out.println(fun(A, B));
        }
    }

    public static int fun(int A, int B) {
        return (A * B) / fun2(B, A);
    }

    public static int fun2(int A, int B) {
        if (B == 0) return A;
        return fun2(B, A % B); 
    }
}