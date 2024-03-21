import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int array[] = new int[10];
		int check = 0;
		boolean bl = false;

		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt() % 42;
		}

		for(int i=0; i<array.length; i++) {
			bl = false;
			for(int j=i+1; j<array.length; j++) {
				if(array[i] == array[j]) {
					bl = true;
					break;
				}
			}
			if(bl==false) {
				check++;
			}
		}

		System.out.println(check);
	}
}
