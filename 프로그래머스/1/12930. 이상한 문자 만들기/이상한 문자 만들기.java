class Solution {
    public String solution(String s) {
        StringBuilder newS = new StringBuilder(); // 결과 문자열
        int idx = 0; // 단어 내 인덱스
        
        for (char c : s.toCharArray()) {
            if (c == ' ') { // 공백 처리
                newS.append(" ");
                idx = 0; // 단어가 끝났으므로 인덱스 초기화
            } else {
                if (idx % 2 == 0) { // 짝수 인덱스
                    newS.append(Character.toUpperCase(c));
                } else { // 홀수 인덱스
                    newS.append(Character.toLowerCase(c));
                }
                idx++; // 단어 내 인덱스 증가
            }
        }
        
        return newS.toString();
    }
}