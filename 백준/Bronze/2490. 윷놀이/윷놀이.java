import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 3;

        for(int j = 0; j < 3; j++) {

        String[] st = br.readLine().split(" ");

        String result = Arrays.stream(st)
                        .collect(Collectors.joining());

        int one = 0;
        int zero = 0;

        for(int i = 0; i < result.length(); i++) {
            if(result.charAt(i) == '1') {
                one += 1;
            } else {
                zero += 1;
            };
        }

        if(one == 3 && zero == 1) System.out.println("A");
        if(one == 2 && zero == 2) System.out.println("B");
        if(one == 1 && zero == 3) System.out.println("C");
        if(one == 0 && zero == 4) System.out.println("D");
        if(one == 4 && zero == 0) System.out.println("E");
    }
    }
}