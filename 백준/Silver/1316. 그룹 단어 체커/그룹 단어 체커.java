import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int wordCount = 0;

        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            
            if(isGroupWord(word)) {
                wordCount++;
            }
        }
        
        System.out.println(wordCount);
    }

    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char prev = ' ';

        for(int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            if(current != prev) {
                if(seen[current - 'a']) {
                    return false;
                }

            seen[current - 'a'] = true;
            prev = current;
                
            }
        }
        return true;
        
    }
}