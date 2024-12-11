import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        int prevNumber = arr[0];
        arrayList.add(prevNumber);
        
        for(int i = 1; i < arr.length; i++) {
            if(prevNumber != arr[i]) {
                arrayList.add(arr[i]);
                prevNumber = arr[i];
            }
        }
        
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}