import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String st[] = br.readLine().split(" ");
            int N = Integer.parseInt(st[0]);
            int K = Integer.parseInt(st[1]);

            ArrayList<Integer> arrayList = new ArrayList<>();

            for(int i = 1; i <= N; i++) {
                if(N % i == 0) {
                    arrayList.add(i);
                }
            }

            if(arrayList.size() < K) {
                System.out.println("0");
            } else {
                System.out.println(arrayList.get(K-1));
            }

        }
    }
