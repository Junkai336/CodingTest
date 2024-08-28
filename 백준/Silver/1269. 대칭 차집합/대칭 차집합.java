import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[2];

        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for (int i = 0; i < 2; i++) array[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < array[0]; i++) hashSet.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < array[1]; i++) hashSet2.add(Integer.parseInt(st.nextToken()));

        int cnt = 0;

        for (Integer item : hashSet) {
            if(hashSet2.add(item)) {
                cnt++;
                hashSet2.remove(item);
            }
        }

        for (Integer item : hashSet2) {
            if(hashSet.add(item)) {
                cnt++;
                hashSet.remove(item);
            }
        }

        System.out.println(cnt);
    }
}