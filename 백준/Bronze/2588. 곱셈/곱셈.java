import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int b2 = b % 100;
        int b3 = b % 10;

        System.out.println(a * b3);
        System.out.println(a * (b2 - b3) / 10);
        System.out.println(a * (b - b2) / 100);
        System.out.println(a * b);


    }
}