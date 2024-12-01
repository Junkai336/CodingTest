class Solution {
    public String solution(String my_string, int m, int c) {
        int divide = my_string.length() / m;
        String[] myStringArray = new String[divide];
        
        String st = "";
        int count = 0;
        for(int i = 0; i < my_string.length(); i++) {
            st += my_string.charAt(i);
            if((i + 1) % m == 0) {
                myStringArray[count++] = st;
                st = "";
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < divide; i++) {
            sb.append(myStringArray[i].charAt(c-1));
        }

        return sb.toString();
    }
}