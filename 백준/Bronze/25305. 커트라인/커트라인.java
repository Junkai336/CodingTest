import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int N = Integer.parseInt(st[0]);
        int K = Integer.parseInt(st[1]);

        System.out.println(cut(N, K, st, br));

        }

        public static int cut(int N, int K, String[] st,  BufferedReader br) throws IOException {
            int[] array = new int[N];
            st = br.readLine().split(" ");

            for(int i = 0; i < N; i++) {
                array[i] = Integer.parseInt(st[i]);
            }

            Arrays.sort(array);

            return array[N - K];
        }

    }