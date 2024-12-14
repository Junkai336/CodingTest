class Solution {
    public int solution(String s) {
        String[] englishNumbers = {"zero", "one", "two", "three", "four", 
                                   "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < englishNumbers.length; i++) {
            s = s.replace(englishNumbers[i], String.valueOf(i));
        }
        
        return Integer.parseInt(s);
    }
}