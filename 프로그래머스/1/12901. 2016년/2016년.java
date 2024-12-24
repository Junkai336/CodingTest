class Solution {
    public String solution(int a, int b) {
        String[] month = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] day = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int differentDay = b;
        for(int i = 1; i < a; i++) {
           differentDay += day[i]; 
        }
        
        String currentMonth = month[(differentDay-1) % 7];
        
        return currentMonth;
        
    }
}