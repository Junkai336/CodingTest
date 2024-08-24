import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        HashSet<String> hashSet = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");

            if(st[1].equals("enter")) {
                hashSet.add(st[0]);
            } else {
                hashSet.remove(st[0]);
            }
        }

        ArrayList<String> resultList = new ArrayList<>(hashSet);
        Collections.sort(resultList, Collections.reverseOrder());

        for (String string : resultList) {
            System.out.println(string);
        }

    }
}