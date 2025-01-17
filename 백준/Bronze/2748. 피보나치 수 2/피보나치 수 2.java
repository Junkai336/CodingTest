import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static HashMap<Integer, Long> hashMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(fib(n));
    }

    public static long fib(int num) {
        if (num <= 1) return num;
        if (hashMap.containsKey(num)) return hashMap.get(num);

        long result = fib(num - 1) + fib(num - 2);

        hashMap.put(num, result);
        return result;
    }
}
