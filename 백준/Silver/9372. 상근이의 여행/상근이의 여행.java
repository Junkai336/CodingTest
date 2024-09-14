import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수

        StringBuilder sb = new StringBuilder();
        
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 국가의 수
            int M = Integer.parseInt(st.nextToken()); // 비행기의 수

            for (int i = 0; i < M; i++) {
                br.readLine();                        // 비행기 a,b 입력받기 (쓰진 않으므로 입력만 받고 날리기)
            }
            
            // 모든 국가를 연결하는 데 필요한 최소 비행기 횟수는 N-1로 고정되어 있음
            // 최소 신장 트리 : 모든 노드를 한 번에 연결하려면, 노드의 개수가 N일 때 최소한의 횟수는 N - 1
            // 1 - 2 - 3 이면 2번 이동해야 한다는 뜻인 듯..?
            sb.append(N - 1).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}