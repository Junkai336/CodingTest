import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();
        int cook = scan.nextInt();

        if ((cook + m) >= 60) {
            h += (cook + m) / 60;
            m = (cook + m) % 60;
        } else if ((cook + m) < 60) {
            m = cook + m;
        }

        if (h >= 24) {
            h -= 24;
        }

        System.out.println(h + " " + m);

    }
}