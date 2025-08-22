import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    /*
        입력
            

        출력
            

        방식


        설명
            

     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String input2 = br.readLine();

        int N = Integer.parseInt(input);
        HashMap<String, Boolean> map = new HashMap<>();
        int count = 0;
        String[] customerArr = input2.split(" ");

        for (int i = 0; i < N; i++) {
            String customer = customerArr[i];

            if (map.containsKey(customer)) {
                count++;
            } else {
                map.put(customer, true);
            }
        }

        System.out.println(count);

    }
}