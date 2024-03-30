import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        int[] array = new int[5];

        while (i < 5) {
            array[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            array[j] = array[j] * array[j];
            sum += array[j];
        }

        System.out.println(sum % 10);

    }
}