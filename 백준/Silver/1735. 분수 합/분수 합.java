import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 기약분수 : 더이상 약분되지 않는 분수
        // 약분 : 분수에서 분모와 분자를 0이 아닌 같은 수로 나누어 크기가 같은 분수로 만드는 것
        // 두 분수 합 구하기 : a/b + c/d = a*d+c*b / b*d

        int a = 0, b = 0, c = 0, d = 0;

        StringTokenizer st;

        for(int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            if(i == 0) {
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
            } else {
                c = Integer.parseInt(st.nextToken()); 
                d = Integer.parseInt(st.nextToken()); 
            }
        }

        int resultA = (a * d) + (b * c);    // 분자
        int resultB = b * d;                // 분모

        int gcd = gcd(resultA, resultB);

        resultA = resultA / gcd;
        resultB = resultB / gcd;

        System.out.println(resultA + " " + resultB);

    }

    // 최대 공약수(GCD) 구하기
    public static int gcd(int resultA, int resultB) {
        if(resultB == 0) return resultA;

        return gcd(resultB, resultA % resultB);
    }
}