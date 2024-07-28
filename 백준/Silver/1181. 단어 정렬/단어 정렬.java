import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] array = new String[N];

        for(int i = 0; i < N; i++) {
            array[i] = br.readLine();
        }

        Set<String> set = new HashSet<>(Arrays.asList(array));
        String[] arrayNotDuplicate = set.toArray(new String[0]);

        Arrays.sort(arrayNotDuplicate, (a, b) -> {
            if(a.length() == b.length()) {
                return a.compareTo(b);  // 사전 순 비교
            } else {
                return a.length() - b.length(); // 길이 순 정렬
            }
        });

        StringBuilder sb = new StringBuilder();

        for(String element : arrayNotDuplicate) {
            sb.append(element).append("\n");
        }

        System.out.println(sb);
    }

}