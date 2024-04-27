import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        ArrayList<Integer> numList = new ArrayList<>();

        for(int i = M; i <= N; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            for(int j = 1; j <= i; j++) {
                if(i % j == 0) arrayList.add(j);
            }

            if(arrayList.size() == 2 && arrayList.get(0) == 1 && arrayList.get(1) == i) {
                sum += i;
                numList.add(i);
            }
        }

        if(sum == 0) {
            System.out.println("-1");
        } else {
            int min = Collections.min(numList);
            System.out.println(sum);
            System.out.println(min);
        }
    }
}