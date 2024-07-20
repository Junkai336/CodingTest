import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int count = 0;
        int line = 0;

        while (count < X) {
            line++;
            count += line;
        }

        int position = X - (count - line);

        int top, bottom;
        
        if (line % 2 == 0) {
            top = position;
            bottom = line - position + 1;
        } else {
            top = line - position + 1;
            bottom = position;
        }

        System.out.println(top + "/" + bottom);
    }
}