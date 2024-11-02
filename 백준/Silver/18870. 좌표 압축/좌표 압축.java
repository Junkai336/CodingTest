import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 정렬된 array에서 상대적인 기준으로 0부터 어느 위치에 있는가?
        // 이중 for문은 O(N^2)으로 시간초과 됨
        // '상대적인' 순서가 필요하므로 중복은 제거
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arraySize = Integer.parseInt(br.readLine());
        int[] array = new int[arraySize];
        int[] sortedArray = new int[arraySize];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arraySize; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        sortedArray = Arrays.copyOf(array, arraySize);
        Arrays.sort(sortedArray);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // i를 넣게 되면, 순서를 그대로 넣으므로 중복이 발생하면 인덱스 어그러짐
        int index = 0;
        for(int i = 0; i < sortedArray.length; i++) {
            if(!hashMap.containsKey(sortedArray[i])) hashMap.put(sortedArray[i], index++);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            sb.append(hashMap.get(array[i])).append(" ");
        }

        System.out.println(sb);

    }
}
