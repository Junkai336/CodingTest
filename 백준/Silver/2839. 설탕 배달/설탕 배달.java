import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = N / 5;
        int remain = N % 5; 

        while (count >= 0) {
            if (remain % 3 == 0) {
                count += remain / 3; 
                System.out.println(count);  
                return;
            }

            // 5kg 봉지로 나누어 떨어지지 않을 때 하나 빼서 3kg 봉지로 나누어 떨어지게 하려고 함. (예: N=6 일 때 5kg 1개 나머지 1 => 3kg 2개)
            // 계속 안나눠떨어지면 count가 -1이 됨
            count--; 
            remain += 5;
        }

        System.out.println("-1");
    }
}