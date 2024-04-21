import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());

            int Qu = 25;
            int Da = 10;
            int Ni = 5;
            int Pe = 1;

            System.out.print(C / Qu + " ");
            C %= Qu;
            System.out.print(C / Da + " ");
            C %= Da;
            System.out.print(C / Ni + " ");
            C %= Ni;
            System.out.print(C / Pe + " " + "\n");
        }
    }
}