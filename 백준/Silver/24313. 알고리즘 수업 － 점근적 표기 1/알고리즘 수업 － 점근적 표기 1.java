import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st1 = br.readLine().split(" ");

        int a1 = Integer.parseInt(st1[0]);
        int a0 = Integer.parseInt(st1[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        boolean result = isCheck(a1, a0, c, n0);

        if(result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    public static boolean isCheck(int a1, int a0, int c, int n0) {

        boolean result = true;

        for(int n = n0; n <= 100; n++) {
            if(a1 * n + a0 > c * n) {
                result = false;
                break;
                
            }
        }

        return result;
    }
}