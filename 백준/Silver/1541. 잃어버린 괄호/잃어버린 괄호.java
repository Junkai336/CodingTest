import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();

        String[] array = st.split("-");

        int result = 0;

        for(int i = 0; i < array.length; i++) {
            String[] array2 = array[i].split("\\+");

            int sum = 0;
            for(int j = 0; j < array2.length; j++) {
                sum += Integer.parseInt(array2[j]);
            }

            if (i == 0) {
                result += sum;
            } else {
                result -= sum;
            }
        }

        System.out.println(result);
    }
}
