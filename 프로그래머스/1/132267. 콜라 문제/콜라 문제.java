class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;
        
        while(n >= a) {
            int divide = n / a;
            int remain = n % a;
                
            result += divide * b;
            n = divide * b + remain;
        }
        
        return result;
    }
}