import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st;

        while (true) {
            st = br.readLine();

            if(st.equals(".")) break;

            if(isBalanced(st)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    // 문자열은 무시. ()끼리, []끼리 짝지가 되면 스택을 비움. 스택이 비워져있으면 return true
    public static Boolean isBalanced(String st) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);

            if(c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if(stack.isEmpty() || stack.peek() != '(') return false;

                stack.pop();
            } else if (c == ']') {
                if(stack.isEmpty() || stack.peek() != '[') return false;

                stack.pop();
            }
        }

        if(stack.isEmpty()) return true;

        return false;
    }

}