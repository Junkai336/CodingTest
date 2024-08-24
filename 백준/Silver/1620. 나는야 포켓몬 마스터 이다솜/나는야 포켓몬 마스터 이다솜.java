import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> hashMap = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String poketName = br.readLine();

            hashMap.put(i + 1, poketName);
            hashMap2.put(poketName, i + 1);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();

            if (input.matches("^[0-9]+$")) {
                System.out.println(hashMap.get(Integer.parseInt(input)));
            } else {
                System.out.println(hashMap2.get(input));
            }

        }

    }
}