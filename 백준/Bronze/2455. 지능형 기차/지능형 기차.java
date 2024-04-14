import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 4;
        int[] maxPeople = new int[N];

        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");

            int getOff = 0;
            int getOn = 0;

            getOff = Integer.parseInt(st[0]);
            getOn = Integer.parseInt(st[1]);

            if(i != 0) {
                maxPeople[i] += maxPeople[i-1] + (getOn - getOff);
            } else maxPeople[i] = (getOn - getOff);
        }

        Arrays.sort(maxPeople);
        System.out.println(maxPeople[maxPeople.length -1]);
    }
}