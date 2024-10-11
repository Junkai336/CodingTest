import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while((input = br.readLine()) != null) {
            int N = Integer.parseInt(input);

            int length = (int) Math.pow(3, N);
            char[] array = new char[length];

            for(int i = 0; i < length; i++) {
                array[i] = '-';
            }

            chantor(array, 0, length);

            System.out.println(array);
        }
    }

    public static void chantor(char[] array, int start, int length) {
        if(length == 1) return;

        int section = length / 3;

        for(int i = start + section; i < start + 2 * section; i++) {
            array[i] = ' ';
        }

        chantor(array, start, section);
        chantor(array, start + 2 * section, section);
    }
}