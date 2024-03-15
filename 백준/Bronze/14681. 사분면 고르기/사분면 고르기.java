import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1");
            return;
        } else if (x > 0 && y < 0) {
            System.out.println("4");
            return;
        } else if (x < 0 && y > 0) {
            System.out.println("2");
            return;
        }
        System.out.println("3");
    }
}