import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            if(word.length() >= M) {
                hashMap.put(word, hashMap.getOrDefault(word, 0)+1);
            }
        }

        LinkedList<String> linkedList = new LinkedList<>(hashMap.keySet());

        Collections.sort(linkedList, (a, b) -> {
            int frequency = hashMap.get(b).compareTo(hashMap.get(a));

            if(frequency == 0) {
                int length = b.length() - a.length();
                if(length == 0) {
                    return a.compareTo(b);                    // 3순위 오름차순 (사전앞 -> 뒤)
                }
                return length;                                // 2순위 길이 : 내림차순
            }
            return frequency;                                 // 1순위 빈도수 : 내림차순 (빈도수가 높은 것 -> 낮은 것 순)
        });

        StringBuilder sb = new StringBuilder();

        for(String item : linkedList) {
            sb.append(item).append("\n");
        }

        System.out.println(sb.toString().trim());

    }
}