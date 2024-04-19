import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String st1 = br.readLine();
            String st2 = br.readLine();
            String st3 = br.readLine();
            String st4 = br.readLine();
            String st5 = br.readLine();

            int max = Math.max(Math.max(st1.length(), st2.length()), Math.max(st3.length(), st4.length()));

            if(max < st5.length()) {
                max = st5.length();
            }

            for(int i = 0; i < max; i++) {
                if(i < st1.length()) System.out.print(st1.charAt(i));
                if(i < st2.length()) System.out.print(st2.charAt(i));
                if(i < st3.length()) System.out.print(st3.charAt(i));
                if(i < st4.length()) System.out.print(st4.charAt(i));
                if(i < st5.length()) System.out.print(st5.charAt(i));
            }
    }
}