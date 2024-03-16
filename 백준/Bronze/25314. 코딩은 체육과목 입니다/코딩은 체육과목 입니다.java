import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String string = "";

        while(N % 4 == 0 && N > 3) {
            string += "long ";
            N -= 4;
        }

        System.out.println(string + "int");
    }
}