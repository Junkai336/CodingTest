import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] A;
    static int K;
    static int[] tmp;
    static int result = -1;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        tmp = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        mergeSort(0, N-1);

        System.out.println(result);

    }

    public static void mergeSort(int p, int r) {
        if(p < r) {
            int q = (p+r)/2;        // q는 p, r의 중간 지점

            mergeSort(p, q);        // 전반부 정렬
            mergeSort(q+1, r);      // 후반부 정렬
            merge(p, q, r);         // 병합
        }
    }

    public static void merge(int p, int q, int r) {
        int i = p;
        int j = q +1;
        int t = p;

        while(i <= q && j <= r) {
            if(A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }

        while (i <= q) tmp[t++] = A[i++];   // 왼쪽 배열 부분이 남은 경우
        while (j <= r) tmp[t++] = A[j++];   // 오른쪽 배열 부분이 남은 경우

        for(i = p; i <= r; i++) {           // 결과를 A[p..r]에 저장
            A[i] = tmp[i];
            count++;
            if(count == K) {
                result = A[i];
            }
        }

    }
}
