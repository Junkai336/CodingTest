import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true) {
            String st = br.readLine();
            if(st.equals("0")) break;
            
            for(int i = 0; i < st.length(); i++) {
                char[] num = new char[st.length()];
                num[i] = st.charAt(i);

                if(i == 0) { sum += 1; }
                if(i == st.length() -1) { sum += 1 + st.length() -1; }
                if(num[i] == '1') { sum += 2; }
                if(num[i] == '2') { sum += 3; }
                if(num[i] == '0') { sum += 4; }
                if(num[i] != '0' && num[i] != '1' && num[i] != '2') { sum += 3; }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}