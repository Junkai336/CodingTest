import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int ok = 1;

        if (st.length() == 0) {
            ok = 0;
        } else if (st.length() == 1) {
            ok = 1;
        } else {
            for (int i = 0; i < st.length(); i++) {
                if((int) st.charAt(i) >= 65 && (int) st.charAt(i) <= 96 ) {
                    ok = 0;
                    System.out.println(ok);
                    return;
                }
                if (st.charAt(i) == st.charAt(st.length() - 1 - i)) {
                    ok = 1;
                } else {
                    ok = 0;
                    System.out.println(ok);
                    return;
                }
            }
        }
        System.out.println(ok);
    }
}