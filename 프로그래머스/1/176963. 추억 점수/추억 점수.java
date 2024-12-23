import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> yearningNameMap = new HashMap<>();
        
        for(int i = 0; i < name.length; i++) {
            yearningNameMap.put(name[i], yearning[i]);
        }
        
        int[] result = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            int sum = 0;
            
            for(int j = 0; j < photo[i].length; j++) {
                sum += yearningNameMap.getOrDefault(photo[i][j], 0);
            }
            result[i] = sum;
        }
        
        return result;
    }
}