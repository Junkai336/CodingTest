import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (map.containsKey(n)) return map.get(n);

        int result = fib(n - 1) + fib(n - 2);
        map.put(n, result);

        return result;
    }
}
