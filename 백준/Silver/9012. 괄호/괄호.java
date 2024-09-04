import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            Boolean isVps = isVps(input);

            System.out.println(isVps ? "YES" : "NO");
        }
    }

    public static Boolean isVps(String input) {
        int balance = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }

            if (balance < 0) return false;              // 닫는 괄호 ')' 가 먼저 나오는 순간 올바른 괄호가 될 수 없음
        }

        return balance == 0;
    }
}