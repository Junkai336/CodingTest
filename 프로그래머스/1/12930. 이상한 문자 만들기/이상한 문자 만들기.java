class Solution {
    public String solution(String s) {
        String[] array = s.split(" ", -1);
        String newS = "";
        
        for(int i = 0; i < array.length; i++) {
            if(i != 0) newS += " ";
            for(int j = 0; j < array[i].length(); j++) {
                if(j % 2 == 0) {
                    newS += String.valueOf(Character.toUpperCase(array[i].charAt(j)));
                } else {
                    newS += String.valueOf(Character.toLowerCase(array[i].charAt(j)));
                }
            }
        }
        
        return newS;
    }
}
