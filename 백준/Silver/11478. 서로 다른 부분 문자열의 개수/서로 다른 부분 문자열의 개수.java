import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();

        HashSet<String> hashSet = new HashSet<>(); 

        for(int i = 0; i < st.length(); i++) {
            for(int j = i+1; j <= st.length(); j++) {
                hashSet.add(st.substring(i, j));
            }
        }

        System.out.println(hashSet.size());
    }
}