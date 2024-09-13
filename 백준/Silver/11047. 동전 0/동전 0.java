import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            linkedList.add(Integer.parseInt(br.readLine()));
        }

        Collections.reverse(linkedList);

        int cnt = 0;

        for(int i = 0; i < linkedList.size(); i++) {
            int coinValue = linkedList.get(i);

            if(K == 0) break;

            if(coinValue <= K) {
                cnt += K / coinValue;
                K %= coinValue;
            }
        }

        System.out.println(cnt);
        
    }
}