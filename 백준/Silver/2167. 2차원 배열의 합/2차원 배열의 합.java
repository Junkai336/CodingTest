import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] array = new int[N][M];  // N행 M열의 2차원 배열 (합을 구할 기준점)
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {

                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder(); // ijxy를 입력하자마자 합을 구하기 위해 문자열 저장

        for(int k = 0; k < K; k++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()) -1;    // 인덱스 array[i] 는 0부터 시작하기 때문에 1행1열은 인덱스상으로는 0행0열
            int j = Integer.parseInt(st.nextToken()) -1;
            int x = Integer.parseInt(st.nextToken()) -1;
            int y = Integer.parseInt(st.nextToken()) -1;

            int sum = 0;

            for(int a = i; a <= x; a++) {           // i행 ~ x행
                for(int b = j; b <= y; b++) {       // j열 ~ y열    
                    sum += array[a][b];
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb.toString());
    }
}