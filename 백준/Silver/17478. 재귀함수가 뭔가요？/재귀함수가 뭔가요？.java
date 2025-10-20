import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            재귀횟수 N

        출력
            응답

        방식
            1.물었다. 가 서두에 먼저 나오고 다시 안나옴
            2.재귀함수가 뭔가요 ~ 선비가 찾아와서 물었어 부분이 반복됨
            3.반복횟수 마지막에 재귀함수가 뭔가요? ~ 자기자신 호출함수라네
            4.끝에 무조건 라고 답변하였지. 나옴 (재귀가 끝난 후 부터 차례대로) (재귀 중 마지막 차례(current == N)부터 시작해서 첫번째 차례(0)까지 차례대로 출력)

        설명
            
     */
    static StringBuilder sb = new StringBuilder();

    static final String START = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
    static final String START2 = "\"재귀함수가 뭔가요?\"";
    static final String START3 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static final String START4 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static final String START5 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";

    static final String MID1 = "\"재귀함수가 뭔가요?\"";
    static final String MID2 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";

    static final String END = "라고 답변하였지.";
    
    static final String BAR = "____";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int N = Integer.parseInt(input);

        recursion(0, N);

        System.out.print(sb.toString());
    }

    public static void recursion(int current, int N) {
        String bar = BAR.repeat(current);

        if(current == 0) {
            sb.append(START).append("\n");
        }

        if(current == N) {
            sb.append(bar).append(MID1).append("\n");
            sb.append(bar).append(MID2).append("\n");
            sb.append(bar).append(END).append("\n");
            return;
        }

        sb.append(bar).append(START2).append("\n");
        sb.append(bar).append(START3).append("\n");
        sb.append(bar).append(START4).append("\n");
        sb.append(bar).append(START5).append("\n");

        recursion(current + 1, N);

        sb.append(bar).append(END).append("\n");
    }
}