import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] st = br.readLine().split(" ");

            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);

            ArrayList<Integer> arrayList = new ArrayList<>();

            st = br.readLine().split(" ");
            for(int i = 0; i < n; i++) {
                arrayList.add(Integer.parseInt(st[i]));
            }

            int result = search(n, m, arrayList);

            System.out.println(result);

        }

        public static int search(int n, int m, ArrayList<Integer> arrayList) {
            int maxsum = 0;

            for(int i = 0; i < n-2; i++) {
                for(int j = i+1; j < n-1; j++) {
                    for(int k = j+1; k < n; k++) {
                        int sum = arrayList.get(i) + arrayList.get(j) + arrayList.get(k);

                        if(sum <= m && sum > maxsum) {
                            maxsum = sum;
                        }
                    }
                }
            }

            return maxsum;
        }
    }