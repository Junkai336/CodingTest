import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // 소수란 1과 자기 자신 외에는 어떤 수로도 나누어 떨어지지 않는 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        String[] st = br.readLine().split(" ");

        int count = 0;

        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(st[i]);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int j = 1; j <= n; j++ ) {
                if(n % j == 0) arrayList.add(j);
            }

            if(arrayList.size() == 2 && arrayList.get(0) == 1 && arrayList.get(1) == n) {
                count++;
            }
        }

        System.out.println(count);

    }
}
