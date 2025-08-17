import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    /*
        입력
            선수의 수
            각 선수의 성

        출력
            5명 선발할 수 있는 성들의 첫글자 (사전순)

        방식
            1. for문 돌리면서 map에 성 첫글자가 key, 몇번 나왔는지가 value로 저장

            2. map에 key들 for문으로 순환하면서 값이 5 이상이면 변수에 저장함

            3. 5글자 이상 저장된 result에 값 없으면 PREDAJA 출력하고 있으면 sout 출력

        설명
            

     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        String input = br.readLine();
        int T = Integer.parseInt(input);

        for(int i = 0; i < T; i++) {
            String lastName = br.readLine();
            String lastNameFirst = lastName.substring(0, 1);

            if(map.containsKey(lastNameFirst)) {
                map.put(lastNameFirst, map.get(lastNameFirst) + 1);
            } else {
                map.put(lastNameFirst, 1);
            }
        }

        ArrayList<String> result = new ArrayList<>();

        for(String key : map.keySet()) {
            if(map.get(key) >= 5) {
                result.add(key);
            }
        }

        if(result.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            Collections.sort(result);

            for(String item : result) {
                System.out.print(item);
            }
        }

    }
}