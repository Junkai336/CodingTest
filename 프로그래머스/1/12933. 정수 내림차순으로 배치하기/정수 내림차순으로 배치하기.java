import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String st = String.valueOf(n);
        Integer[] array = new Integer[st.length()];
        
        for(int i = 0; i < st.length(); i++) {
            array[i] = st.charAt(i) - '0';
        }
        
        Arrays.sort(array, Collections.reverseOrder());
        
        String st2 = "";
        for(int i = 0; i < array.length; i++) {
            st2 += String.valueOf(array[i]);
        }
        
        long answer = Long.parseLong(st2);
        return answer;
    }
}