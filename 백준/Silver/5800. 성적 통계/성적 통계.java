import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    /*
        입력
            반의 수 K
            각 반의 학생 수 N, 수학 성적

        출력
            1. Class 반번호
            2. Max 가장높은점수, Min 가장낮은점수, Largest gap 가장큰인접한점수차이

        방식
            1. Max와 MiN은 정렬 메소드 후 내림차순으로 만들고 첫번째, 마지막번째 인덱스 값으로 구함
            2. Largest gap은 배열이 이미 내림차순이 되어 있으니, 이전 차이값이랑 현재 차이값이랑 비교하고 더 큰 값 변수에 저장함

        설명
            
     */
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int K = Integer.parseInt(input);

        for(int i = 0; i < K; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");

            int N = Integer.parseInt(parts[0]);
            int[] scores = new int[N];

            for(int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(parts[j + 1]);
            }

            calculate(scores, i + 1);
        }

        System.out.println(sb.toString());
    }

    public static void calculate(int[] scores, int order) {
        Arrays.sort(scores);

        for (
                int i = 0, j = scores.length - 1; 
                i < j; 
                i++, j--
            ) {
                int temp = scores[i];
                scores[i] = scores[j];
                scores[j] = temp;
        }

        int max = scores[0];
        int min = scores[scores.length - 1];
        int largestGap = 0;

        for(int k = 0; k < scores.length - 1; k++) {
            largestGap = Math.max(Math.abs(scores[k] - scores[k + 1]), largestGap);
        }

        sb.append("Class ").append(order).append("\n");
        sb.append("Max ").append(max).append(", ");
        sb.append("Min ").append(min).append(", ");
        sb.append("Largest gap ").append(largestGap).append("\n");
    }
}