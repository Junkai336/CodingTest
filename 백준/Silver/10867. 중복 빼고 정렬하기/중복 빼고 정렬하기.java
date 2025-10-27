import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    /*
        입력
            첫째 줄 : 수의 개수 N
            둘째 줄 : 숫자들

        출력
            첫째 줄에 수를 오름차순으로 정렬한 결과, 같은 수 한번만

        방식
            

        설명
            TreeSet이 기본 오름차순 정렬 + 중복제거 보장함
            이중 for문은 시간초과 남;;;
            
     */
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        TreeSet<Integer> treeSet = new TreeSet<>();
        
        for (int i = 0; i < N; i++) {
            treeSet.add(Integer.parseInt(numbers[i]));
        }

        for (Integer num : treeSet) {
            System.out.print(num + " ");
        }

    }
}