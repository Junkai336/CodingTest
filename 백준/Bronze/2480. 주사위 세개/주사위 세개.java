import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = 0;

        if(a == b && b == c && a == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b && b != c) {
            System.out.println(1000+a*100);
        } else if (a != b && b == c) {
            System.out.println(1000+b*100);
        } else if (a == c && b != c && a != b) {
            System.out.println(1000+a*100);
        } else if (a != b && b != c) {
                if(a>b && a>c) {
                    d = a;
                } else if(b>c && b>a) {
                    d = b;
                } else if(c>a && c>b) {
                    d = c;
                }
                System.out.println(d*100);
        }
    }
}