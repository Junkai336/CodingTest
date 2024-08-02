import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();

        int length = st.length();
        String bestWord = null;

        
        for(int i = 1; i < length - 1; i++) {
            for(int j = i+1; j < length; j++) {
                String part1 = st.substring(0, i);
                String part2 = st.substring(i, j);
                String part3 = st.substring(j, length);

                String reversedPart1 = new StringBuilder(part1).reverse().toString();
                String reversedPart2 = new StringBuilder(part2).reverse().toString();
                String reversedPart3 = new StringBuilder(part3).reverse().toString();

                String newWord = reversedPart1 + reversedPart2 + reversedPart3;

                // 사전순으로 비교했을 때 newWord가 bestWord보다 앞서면 newWord로 바꿈
                // 음수 : 사전적으로 앞에 오는 경우 , 양수 : 사전적으로 뒤에 오는 경우 , 0 : 같음
                if(bestWord == null || newWord.compareTo(bestWord) < 0) {
                    bestWord = newWord;
                }
            }
        }

        System.out.println(bestWord);

        
        }
    }