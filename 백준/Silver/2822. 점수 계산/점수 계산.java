import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[8];           // 점수
        Integer[] index = new Integer[8];   // 인덱스

        for(int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(br.readLine()); // 점수 입력
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> score[b] - score[a]);  // 점수를 기준으로 내림차순으로 인덱스 정렬

        int total = 0;

        for(int i = 0; i < 5; i++) {
            total += score[index[i]];   // 내림차순 정렬한 걸로 상위 5개 합계 구하기, 내림차순 정렬한 상위 5개의 인덱스를 가진 점수 더하기
        }

        StringBuilder sb = new StringBuilder();

        sb.append(total).append("\n");

        Integer[] topFiveScore = Arrays.copyOfRange(index, 0, 5);   // 배열 인덱스 0번부터 4번까지 복제

        Arrays.sort(topFiveScore);  // 5 , 7 , 8 , 1 , 2 이런 식으로 저장되어 있어서 한 번 정렬 해야 함

        for(int i = 0; i < 5; i++) {
            sb.append(topFiveScore[i] + 1).append(" ");
        }

        System.out.println(sb.toString());

    }
}