import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            여러 개 테스트 케이스
            각 줄에 테스트할 패스워드 입력

        출력
            입력된 문자열이 적합한 지, 아닌 지 .

        방식
            1. 모음인지 자음인지 체크할 때 자음숫자, 모음숫자 판단
            2. 3개 연속인지 체크해야 하므로, 모음 체크할 때 이전 거랑 다르면 초기화 하는데, 계속 ++되면 다음 유효성검사에서 연속되었다고 판단
            3. 이전 글자랑 현재 글자랑 다른지 판단해서 유효성 검사
            4. 모음체크는 모음이다. 하면 true (통과),
                3개 연속체크는 3개 연속이면 true (실패),
                같은 글자 연속체크는 e,o 빼고 같은 글자가 연속되면 true (실패)

        설명
            모음(a,e,i,o,u) 하나를 반드시 포함
            모음이 3개 혹은 자음이 3개 연속으로 오면 안 됨
            같은 글자가 연속적으로 두 번 오면 안 되나, ee 와 oo는 허용
            
     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String input = br.readLine();
            
            if(input.equals("end")) break;

            String result = validate(input);

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }

    public static String validate(String input) {
        String result = "";
        boolean isValid = false;

        boolean valid1 = false;

        boolean valid2 = false;
        int seqConsonant = 0;       // 연속 자음
        int seqVowel = 0;           // 연속 모음

        boolean valid3 = false;

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // 모음 체크
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                valid1 = true;
                seqConsonant = 0;
                seqVowel += 1;
            } else {
                seqConsonant += 1;
                seqVowel = 0;
            }

            // 3개 연속 체크
            if (seqConsonant >= 3 || seqVowel >= 3) {
                valid2 = true;
            }

            // 같은 글자 연속 체크
            if(i >= 1) {
                char ch1 = input.charAt(i - 1);

                if(ch1 == ch && !(ch == 'e' || ch == 'o')) {
                    valid3 = true;
                }
            }
        }

        // 결과 체크
        isValid = valid1 && !valid2 && !valid3;

        if(isValid) {
            result = "<" + input + "> is acceptable.";
        } else {
            result = "<" + input + "> is not acceptable.";
        }

        return result;
    }
}