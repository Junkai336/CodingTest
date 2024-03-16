import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int sum = 0;
        
        for(int i = 0; i <= T; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}