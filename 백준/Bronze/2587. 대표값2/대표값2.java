import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int avg = average(a,b,c,d,e);
        int cen = center(a,b,c,d,e);

        System.out.println(avg);
        System.out.println(cen);

        }

        public static int average(int a, int b, int c, int d, int e) {
            int avg = (a + b + c + d + e) / 5;

            return avg;
        }

        public static int center(int a, int b, int c, int d, int e) {
            int[] array = new int[5];
            
            array[0] = a;
            array[1] = b;
            array[2] = c;
            array[3] = d;
            array[4] = e;

            Arrays.sort(array);

            int cen = array[2];

            return cen;
        }
    }