import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> bookList = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String book = br.readLine();

            if(bookList.containsKey(book)) {
                bookList.put(book, bookList.get(book) +1);
            } else {
                bookList.put(book, 1);
            }
        }

        int maxBookCnt = 0;
        String maxBookNm = "";

        for(Map.Entry<String, Integer> entry : bookList.entrySet()) {
            String bookNm = entry.getKey();
            int cnt = entry.getValue();

            if(maxBookCnt < cnt || (maxBookCnt == cnt && bookNm.compareTo(maxBookNm) < 0)) {
                maxBookCnt = cnt;
                maxBookNm = bookNm;
            }
        }

        System.out.println(maxBookNm);

    }
}