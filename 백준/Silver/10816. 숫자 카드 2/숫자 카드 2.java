import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        // 첫번째 입력에서 빈도수 미리 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1); // getOrDefault : 특정 키가 HashMap에 존재하지 않으면 기본값 반환
        }

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        // 두번째 입력에서 키 찾아서 출력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            sb.append(hashMap.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(sb);

    }
}