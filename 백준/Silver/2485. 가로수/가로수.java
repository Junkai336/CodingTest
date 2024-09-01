import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] trees = new int[N];

        for(int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int[] distance = new int[trees.length -1];

        // 트리의 간격 계산 (N개의 가로수, N-1개의 간격)
        for(int i = 0; i < trees.length -1; i++) {
            distance[i] = trees[i+1] - trees[i];
        }

        int gcd = distance[0];

        // 모든 간격의 최대공약수 구하기
        for(int i = 1; i < distance.length; i++) {
            gcd = gcd(gcd, distance[i]);
        }

        // 각 간격을 최대 공약수로 나눔
        // 간격: 6 , 최대공약수 : 2 => 3개의 동일한 간격
        // 3개의 간격[(distance[i] / gcd)]을 생성하기 위해 가로수 2개[-1] 필요
        int totalTreesNeedCnt = 0;
        for(int i = 0; i < distance.length; i++) {
            totalTreesNeedCnt += (distance[i] / gcd) - 1;
        }

        System.out.println(totalTreesNeedCnt);

    }

    // 유클리드 호제법 : 최대 공약수 구하기
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, (a % b));
    }
}