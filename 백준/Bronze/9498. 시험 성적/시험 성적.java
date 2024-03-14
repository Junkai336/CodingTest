import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int point;

        Scanner scan = new Scanner(System.in);

        point = scan.nextInt();

        if(point >= 90 && point <= 100) {
            System.out.println("A");
            return;
        } else if (point >= 80 && point <= 89) {
            System.out.println("B");
            return;
        } else if (point >= 70 && point <= 79) {
            System.out.println("C");
            return;
        } else if (point >= 60 && point <= 69) {
            System.out.println("D");
            return;
        }
        System.out.println("F");
        
    }
}