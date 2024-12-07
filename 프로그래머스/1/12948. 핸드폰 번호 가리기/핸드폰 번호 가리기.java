class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        
        String front = phone_number.substring(0, length - 4);
        String back = phone_number.substring(length - 4);
        
        front = front.replaceAll(".", "*");
        
        String answer = front + back;
        return answer;
    }
}