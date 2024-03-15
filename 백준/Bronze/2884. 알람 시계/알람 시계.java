import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();

        m -= 45;

        
        if(m >= 60) {
            h += 1;
            m = 0;
        }

        if(m < 0) {
            m += 60;
            h -= 1;
        }

        if(h < 0) {
            h = 23;
        }

        if(h > 23) {
            h = 0;
        }


        System.out.println(h + " " + m);

    }
}