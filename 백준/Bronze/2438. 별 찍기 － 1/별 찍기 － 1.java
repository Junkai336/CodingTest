import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();
        
        for(int i=0; i<star; i++) {
            for(int j=0; j<i+1; j++) {
                if(j == (i)) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }
        }
    }
}
