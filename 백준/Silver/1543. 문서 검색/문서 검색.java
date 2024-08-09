import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        String searchSt = br.readLine();
        int index = 0;
        int count = 0;

        while(true) {
            index = st.indexOf(searchSt, index);    // searchSt를 찾은 뒤 있으면 그 인덱스를 반환

            if(index == -1) break;                  // 문자가 없으면 -1

            count++;

            index += searchSt.length();             // 찾은 문자열 길이만큼 + 해서 다시 찾아야 함
        }

        System.out.println(count);

    }
}