import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(fibo(N));

        }

        public static int fibo(int N) {

            if(N == 0) return 0;
            if(N == 1) return 1;
            
            return (fibo(N-2) + fibo(N-1));
        }
    }