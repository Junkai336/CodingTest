import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = 3;

        for (int i = 0; i < T; i++) {
            BigInteger sum = new BigInteger("0");

            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                BigInteger b = new BigInteger(br.readLine());
                sum = sum.add(b);
            }

            switch (sum.compareTo(BigInteger.ZERO)) {
                case 0:
                    System.out.println("0");
                    break;
                case -1:
                    System.out.println("-");
                    break;
                case 1:
                    System.out.println("+");
                    break;
            }

            sum.subtract(sum);

        }

    }
}