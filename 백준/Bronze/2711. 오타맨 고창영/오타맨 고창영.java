import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            테스트 케이스
            오타낸 위치 + 문자열

        출력
            오타 지운 문자열

        방식
            1. substring으로 시작부터 특정 부분전까지 자르고
            2. substring으로 특정부분 이후부터 가져와서 합침

        설명
            

     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int T = Integer.parseInt(input);

        for(int i = 0; i < T; i++) {
            String[] line = br.readLine().split(" ");

            int index = Integer.parseInt(line[0]);
            String str = line[1];

            String result = str.substring(0, index - 1) + str.substring(index);

            System.out.println(result);
        }

    }
}