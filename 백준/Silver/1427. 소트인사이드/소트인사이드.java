import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        Integer[] numArray = new Integer[num.length()];

        for(int i = 0; i < num.length(); i++) {
            numArray[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        Arrays.sort(numArray, Collections.reverseOrder()); // Comparator 객체는 Integer 같은 객체 배열에서만 작동함

        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]);
        }

    }

}