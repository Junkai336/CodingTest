import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        int N = Integer.parseInt(st[0]);

        int[] array = new int[N];

        array = sort(array, N, br);

        Arrays.sort(array);

        for (Integer integer : array) {
            System.out.println(integer);
        }

    }

    public static int[] sort(int[] array, int N, BufferedReader br) throws IOException {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            hashSet.add(num);
        }

        Iterator<Integer> iterator = hashSet.iterator();

        for (int j = 0; j < hashSet.size(); j++) {
            if(iterator.hasNext()) {
                array[j] = iterator.next();
            }
        }

        return array;
    }
}