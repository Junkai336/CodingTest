import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    /*
        입력
            영단어 두 줄

        출력
            몇 글자 제거해야 같은 문자가 있는 문자열이 되는지? (equals 관계 아님)
            예) red = edr

        방식
            1. for문 돌려서 map에다가 알파벳 등장 횟수 저장함

            2-1. map1에만 있거나, map2에만 있는 건 어차피 제거해야 하니까 count에 더하고
            2-2. map1과 map2 둘 다에 있으면 등장 횟수 차이 차감함 (10개, 1개면 9개가 제거되어야 1개니깐 ㅇㅇ)

        설명
            aabbcc
            xxyyyb 에서

            aa, cc, xx, yyy, b 제거되어야 함 (10개)
            

     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input1 = br.readLine();
        String input2 = br.readLine();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < input2.length(); i++) {
            char c = input2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        int count = 0;

        for (char c : map1.keySet()) {
            if (map2.containsKey(c)) {
                count += Math.abs(map1.get(c) - map2.get(c));
            } else {
                count += map1.get(c);
            }
        }

        for (char c : map2.keySet()) {
            if (!map1.containsKey(c)) {
                count += map2.get(c);
            }
        }

        System.out.println(count);

    }
}