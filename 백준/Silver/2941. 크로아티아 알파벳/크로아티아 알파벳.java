import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();

        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(String i : alpha) {
            if(st.contains(i)) {
                st = st.replace(i, "1");
            }
        }

        System.out.println(st.length());
    }
}