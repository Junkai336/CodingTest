import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        int num = N;
        int circle = 0;

        do {
            if(num < 10) {
                num = num * 10 + num;
            } else {
                int ten = num / 10;
                int one = num % 10;
                int sum = ten + one;
                num = (one * 10) + (sum % 10);
            }
            circle++;
        } while(num != N);

        System.out.println(circle);
    }
}