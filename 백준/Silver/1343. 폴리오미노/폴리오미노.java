import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            문자열로 덮을 수 있는 보드판 X 덩어리

        출력
            사전 순으로 가장 앞서게 겹침없이 AAAA, BB 덮는 정답

        방식
            1. AAAA가 먼저 나와야 사전 순이 맞으니까 XXXX는 AAAA로 바꾸고 XX는 BB로 바꿈
            2. X가 남았다는게 1개 내지는 3개가 남았다는 의미니까 홀수개가 있어서 덮을 수 없는 경우니까 -1 출력
            3. AAAA 먼저 바꿨으니까 사전순 맞음 출력함~

        설명
            
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String result = input.replaceAll("XXXX", "AAAA").replaceAll("XX", "BB");

        if(result.contains("X")) {
            System.out.println("-1");
        } else {
            System.out.println(result);
        }

    }
}