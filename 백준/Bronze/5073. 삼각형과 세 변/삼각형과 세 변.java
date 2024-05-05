import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String[] st = br.readLine().split(" ");

            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int c = Integer.parseInt(st[2]);

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Invalid");
            } 

            else if (a == b && b == c) {
                System.out.println("Equilateral");
            } 

            else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } 

            else {
                System.out.println("Scalene");
            }
        }
    }
}