import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            if (input.equals("*"))
                return;

            boolean isSurprising = isSurprising(input);

            if (isSurprising) {
                System.out.println(input + " is surprising.");
            } else {
                System.out.println(input + " is NOT surprising.");
            }
        }
    }

    static boolean isSurprising(String input) {

        for (int d = 1; d < input.length(); d++) {
            HashSet<String> hashSet = new HashSet<>();

            for (int i = 0; i < input.length() - d; i++) {
                String word = "" + input.charAt(i) + input.charAt(i + d);

                if (hashSet.contains(word)) return false;

                hashSet.add(word);
            }
        }

        return true;
    }
}
