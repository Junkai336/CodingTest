import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*
        입력
            1. N개의 수
            
            2. 수열 A1 ~ An
            
            3. +개수, -개수, *개수, /개수

        출력
            N개의 수 , 연산자가 주어졌을 때
            첫째줄 결과값 최대,
            둘째줄 결과값 최소

        방식
            1. 최대값, 최소값 선언
            2. 연산자는 다 쓰이지 않아도 돼서 반복은 N개의 수에 맞추면 됨
            3. 연산자가 우선순위를 안 따지기 때문에 앞에서부터 연산해도 됨 = +부터 검사하고 진행해도 된다는 이야기
            4. if문으로 연산자 개수만큼 로직 진행해서 각 분기마다 모든 경우 수 검사
            5. 각 분기마다 전역변수인 max, min에다가 Math.max, Math.min으로 최대값 최소값 비교함

        설명
            모든 수 사이에 연산자 한 개 끼워넣어야 함
            
            주어진 연산자를 모두 사용하지 않고 모든 수의 사이에 연산자를 끼워넣을 수 있음
            
            식 계산은 연산자 우선순위 무시해야 하고 앞에서부터 진행해야 함
            
            나눗셈은 정수 나눗셈으로 몫만 취함
            
            음수를 양수로 나눌 때는 C++14의 기준을 따름 (자바에서 이미 채택)

     */

    static int N;
    static int[] A;
    static int[] operator = new int[4]; // + - * /
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        A = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, A[0], operator[0], operator[1], operator[2], operator[3]);

        System.out.println(max);
        System.out.println(min);

        br.close();
    }

    public static void dfs(int index, int currentNum, int plus, int minus, int multiply, int divide) {
        if(index == N - 1) {
            max = Math.max(max, currentNum);
            min = Math.min(min, currentNum);
            return;
        }

        int nextNum = A[index + 1];

        if(plus > 0) {
            int newNum = oper(currentNum, nextNum, "+");
            dfs(index + 1, newNum, plus - 1, minus, multiply, divide);
        }

        if(minus > 0) {
            int newNum = oper(currentNum, nextNum, "-");
            dfs(index + 1, newNum, plus, minus - 1, multiply, divide);
        }
        
        if(multiply > 0) {
            int newNum = oper(currentNum, nextNum, "*");
            dfs(index + 1, newNum, plus, minus, multiply - 1, divide);
        }
        
        if(divide > 0) {
            int newNum = oper(currentNum, nextNum, "/");
            dfs(index + 1, newNum, plus, minus, multiply, divide - 1);
        }
        
    }

    public static int oper(int currentNum, int nextNum, String op) {
        int result = 0;

        switch (op) {
            case "+" :
                result = currentNum + nextNum;
                break;
            case "-" :
                result = currentNum - nextNum;
                break;
            case "*" :
                result = currentNum * nextNum;
                break;
            case "/" :
                result = currentNum / nextNum;
                break;
        }

        return result;
    }
}