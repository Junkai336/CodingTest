import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            8개 줄의 체스판 상태
            . : 빈칸
            F : 말이 있는 칸

        출력
            하얀 칸 위에 말이 몇 개 있는지?

        방식
            짝수행은 열이 하-검 구조고
            홀수행은 열이 검-하 구조니까
            if문으로 분기함

        설명
            (0,0) ~ (0,7) : 하-검-하-검-하-검-하-검
            (1,0) ~ (1,7) : 검-하-검-하-검-하-검-하 구조임

     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 0;

        for (int i = 0; i < 8; i++) {
            String line = br.readLine();
                for (int j = 0; j < 8; j++) {
                    if(i % 2 == 0) {
                        if (j % 2 == 0 && line.charAt(j) == 'F') count++;   // 짝수행일 때 짝수열이면 하-검-하-검 (0, 2, 4, 6 검사)
                    } else {
                        if (j % 2 == 1 && line.charAt(j) == 'F') count++;   // 홀수행일 때 홀수열이면 검-하-검-하 (1, 3, 5, 7 검사)
                    }
                }
        }

        System.out.println(count);

    }
}