import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[2];

        for (int i = 0; i < 2; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();

        for (int i = 0; i < array[0]; i++) {
            hashSet.add(br.readLine());
        }

        for (int i = 0; i < array[1]; i++) {
            hashSet2.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();

        for (String name : hashSet) {
            if (hashSet2.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }

    }
}