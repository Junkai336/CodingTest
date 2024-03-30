import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] array = new String[s.length()];

        br.close();

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            char C = s.charAt(i);
            if (c >= 65 && c <= 90) {
                bw.write(Character.toLowerCase(C));
            } else if (c >= 97 && c <= 122) {
                bw.write(Character.toUpperCase(C));
            }
        }

        bw.flush();
        bw.close();
    }
}