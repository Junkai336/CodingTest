import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        Integer center = 0, maxFrequency = 0, range = 0, sum = 0, maxFrequencyItem = 0;

        Collections.sort(arrayList, (a, b) -> {
            return a - b;
        });
        center = arrayList.get((arrayList.size() / 2));

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer item : arrayList) {
            sum += item;

            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        ArrayList<Integer> modeList = new ArrayList<>();
        maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                modeList.clear();  // 새로운 최빈값이 발견되면 리스트 초기화
                modeList.add(entry.getKey());
            } else if (frequency == maxFrequency) {
                modeList.add(entry.getKey());  // 같은 빈도수를 가진 값들을 추가
            }
        }

        // 여러 최빈값이 있을 경우, 두 번째로 작은 값 찾기
        Collections.sort(modeList);
        maxFrequencyItem = modeList.size() > 1 ? modeList.get(1) : modeList.get(0);

        range = Collections.max(arrayList) - Collections.min(arrayList);

        System.out.println(Math.round((double) sum / (double) N));
        System.out.println(center);
        System.out.println(maxFrequencyItem);
        System.out.println(range);
    }
}
