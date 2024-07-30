import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arrayN = new int[N];
        String[] stN = br.readLine().split(" ");
        
        for(int i = 0; i < N; i++) {
            arrayN[i] = Integer.parseInt(stN[i]);
        }

        Arrays.sort(arrayN);    // 이진 탐색 하려면 정렬되어 있어야 함
        
        int M = Integer.parseInt(br.readLine());
        int[] arrayM = new int[M];
        String[] stM = br.readLine().split(" ");

        for(int i = 0; i < M; i++) {
            arrayM[i] = Integer.parseInt(stM[i]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            if(binarySearch(arrayN, arrayM[i])) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);

    }

    public static boolean binarySearch(int[] arrayN, int arrayM) {
        // 인덱스
        int left = 0;
        int right = arrayN.length - 1;

        while(left <= right) {
            int middle = (left + right) / 2;

            if(arrayN[middle] == arrayM) {
                return true;
            } else if(arrayN[middle] < arrayM) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        
        return false;
    }
}