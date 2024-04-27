import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int N = Integer.parseInt(br.readLine().trim());
            if (N == -1) break;

            ArrayList<Integer> divisors = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }

            if (sum == N) {
                System.out.print(N + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    System.out.print(divisors.get(i));
                    if (i < divisors.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(N + " is NOT perfect.");
            }
        }
    }
}