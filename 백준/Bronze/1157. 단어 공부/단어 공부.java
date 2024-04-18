import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine().toUpperCase();
        int[] array = new int[100];

        for (int i = 0; i < st.length(); i++) {
            array[(int) st.charAt(i)] += 1;
        }

        int max = array[0];
        for (int k = 0; k < array.length; k++) {
            max = Math.max(max, array[k]);
        }

        int dup = 0;
        int seq = 0;

        for (int k = 0; k < array.length; k++) {
            if(array[k] == max) {
                dup += 1;
                seq = k;
            }
        }

        if(dup == 1) {
            System.out.println((char) seq);
        } else if(dup > 1) {
            System.out.print("?");
        }
    }
}