class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        
        for(int i = 1; i <= count; i++) {
            totalPrice += price * i;
        }
        
        long sum = (long) money - totalPrice;
        long answer = 0;
        
        if(sum >= 0) {
            answer = 0;
        } else {
            answer = Math.abs(sum);
        }

        return answer;
    }
}