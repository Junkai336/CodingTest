import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int count0 = 0;
        int count1 = 0;

        // 먼저 첫번째 숫자에서 0인지 1인지에 따라서 카운트 증가 (비교를 해야 하는데 문자열 쭉 읽을 때 첫번째 인덱스에서 charAt(i-1)하면 에러나기 때문)
        if(S.charAt(0) == '0') {
            count0++;
        } else {
            count1++;
        }

        // 현재 숫자가 이전 숫자랑 다르면 현재 숫자 카운트를 증가시킴
        for(int i = 1; i < S.length(); i++) {
            if(S.charAt(i) != S.charAt(i-1)) {
                if(S.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
        }

        // 카운트가 더 적은 쪽을 뒤집음. (최소 횟수를 구해야 하기 때문)
        System.out.println(Math.min(count0, count1));

    }
}