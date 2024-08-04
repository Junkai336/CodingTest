import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        int[] card = new int[10];

        // 글자 자리수를 세기 위해 String을 char로 바꾸고 숫자의 등장 횟수를 배열에 저장
        for(char ch : N.toCharArray()) {
            int num = ch - '0';
            card[num]++;
        }

        // 6과 9는 서로 대체 가능
        // 한 세트에 6과 9가 있기 때문에 더하고 나누기 2 (69면 2세트가 아니라 1세트로 가능)
        int sixNineCnt = card[6] + card[9];
        int requiredSixNineSet = (int) Math.ceil(sixNineCnt / 2.0);

        // card의 등장횟수를 통해 필요 세트 구함
        // 6과 9는 별도로 계산해서 더함  
        int requiredSet = 0;
        for(int i = 0; i < 10; i++) {
            if(i == 6 || i == 9) continue;
            requiredSet = Math.max(requiredSet, card[i]);
        }

        requiredSet = Math.max(requiredSet, requiredSixNineSet);

        System.out.println(requiredSet);

    }
}