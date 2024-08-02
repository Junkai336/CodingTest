import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int cnt = 0;

        // 딱 절반으로 안쪼개지면 풀로 붙일 막대가 1개씩 더 필요한듯
        // 2의 n승이므로 2진수 비트연산자 사용
        while(X > 0) {
            if((X & 1) == 1) {
                cnt++;
            }
            X >>= 1; // 23[1] 11[2] 5[3] 2 1[4] 0
        }

        System.out.println(cnt);
        
        }
    }