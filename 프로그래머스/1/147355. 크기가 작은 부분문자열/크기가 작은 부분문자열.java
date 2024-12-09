class Solution {
    public int solution(String t, String p) {
        int length = p.length();
        long longP = Long.parseLong(p);
        int count = 0;
        
        for(int i = 0; i <= t.length() - length; i++) {
            String st = t.substring(i, i+length);
            long longSt = Long.parseLong(st);
            if (longP >= longSt) count++;
        }
        
        return count;
    }
}