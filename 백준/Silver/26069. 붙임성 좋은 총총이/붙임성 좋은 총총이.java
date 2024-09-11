import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("ChongChong");

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String beforePerson = st.nextToken();
            String afterPerson = st.nextToken();

            if(hashSet.contains(beforePerson)) {
                hashSet.add(afterPerson);
            } else if(hashSet.contains(afterPerson)) {
                hashSet.add(beforePerson);
            }

        }

        System.out.println(hashSet.size());

    }
}
