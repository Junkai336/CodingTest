import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] st = br.readLine().split(" ");
            int[] array = new int[3];
            
            for(int i = 0; i < 3; i++) {
                array[i] = Integer.parseInt(st[i]);
            }
            
            Arrays.sort(array);

            int a = array[0];
            int b = array[1];
            int c = array[2];

            if((a + b) <= c) {
                c = a+b-1;
            }

            System.out.println(a + b + c);
        }
    }