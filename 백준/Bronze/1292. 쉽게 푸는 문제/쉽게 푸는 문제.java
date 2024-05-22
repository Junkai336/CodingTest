import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int A = Integer.parseInt(st[0]);
        int B = Integer.parseInt(st[1]);

        ArrayList<Integer> numList = new ArrayList<>();

        for(int i = 1; i < 1000; i++) {
            for(int j = 0; j < i; j++) {
                numList.add(i);
                if(numList.size() >= 1000) {
                    break;
                }
            }
        }

        int sum = 0;

        for(int k = A-1; k < B; k++) {
            sum += numList.get(k);
        }

        System.out.println(sum);

    }

}