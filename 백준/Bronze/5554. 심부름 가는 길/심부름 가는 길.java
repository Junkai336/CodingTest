import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sec1 = Integer.parseInt(br.readLine());
        int sec2 = Integer.parseInt(br.readLine());
        int sec3 = Integer.parseInt(br.readLine());
        int sec4 = Integer.parseInt(br.readLine());
        
        int sec5 = sec1 + sec2 + sec3 + sec4;

        int min = sec5 / 60;
        int sec = sec5 - (min * 60);

        bw.write(String.valueOf(min + "\n"));
        bw.write(String.valueOf(sec));

        br.close();
        bw.flush();
        bw.close();
    }
}