import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(array);

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < array.length; j++) {
            sb.append(array[j]).append('\n');
        }

        System.out.println(sb);

    }

}