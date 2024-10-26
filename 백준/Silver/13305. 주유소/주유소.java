import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 도시 개수
        long[] distance = new long[N + 1];          // 도로의 길이
        long[] price = new long[N + 1];             // 기름 가격

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            distance[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }

        long minPrice = price[0];
        long minTotalPrice = 0;

        for(int i = 0; i < distance.length; i++) {
            long currentPrice = price[i];

            if(minPrice < currentPrice) {
                minPrice = currentPrice;
            }
            minTotalPrice += minPrice * distance[i];
        }


        System.out.println(minTotalPrice);

    }
}