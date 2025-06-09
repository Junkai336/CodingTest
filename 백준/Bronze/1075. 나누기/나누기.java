import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            정수 N (100 이상)
            정수 F (100 이하)

        출력
            마지막 두 자리 출력 (한자리면 앞에 0 추가)

        방식
            for문 노가다하고 String 두자리 파싱

            N이 1111이면 나누기 100해서 소수점 버리고 다시 곱하기 100해서 1100으로 만들고 00~99 비교
            나머지 100하면 두자리 수 찾을 수 있음 1234 / 100 = 12 ... 34

        설명
            정수 N의 가장 뒤 두 자리 적절히 바꿔서 N을 F로 나누어 떨어지게 함

            N의 뒤 두 자리를 00부터 99까지 바꿔가며 F로 나누어 떨어지는지 확인
     */
    static String result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        cal(N, F);

        System.out.println(result);
    }

    public static void cal(int N, int F) {
        for (int i = 0; i < 100; i++) {
            int num = N / 100 * 100 + i;
            if (num % F == 0) {
                result = parseStr(num % 100);
                break;
            }
        }
    }

    public static String parseStr(int num) {
        return String.format("%02d", num);
    }
}