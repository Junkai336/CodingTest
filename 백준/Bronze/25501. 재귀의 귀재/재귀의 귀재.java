import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String st = br.readLine();
            int[] count = {0};
            int result = isPalindrome(st, count);
            System.out.println(result + " " + count[0]);
        }

        }

        public static int isPalindrome(String st, int[] count) {
            return recursion(st, 0, st.length() - 1, count);
        }

        public static int recursion(String st, int in, int stLen, int[] count) {
            count[0]++;
            if(in >= stLen) return 1;
            else if (st.charAt(in) != st.charAt(stLen)) return 0;
            else return recursion(st, in +1, stLen -1, count);
        }
    }