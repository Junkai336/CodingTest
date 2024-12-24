class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;
        
        for(int i = 1; i <= number; i++) {
            int factor = factor(i);
            
            result += factor > limit ? power : factor;
        }
        
        return result;
    }
    
    public int factor(int number) {
        int cnt = 0;
        
        for(int i = 1; i * i <= number; i++) {
            if(number % i == 0) {
                cnt++;
                if (i != number / i) {
                    cnt++;
                }
            }

        }
        
        return cnt;
    }
}