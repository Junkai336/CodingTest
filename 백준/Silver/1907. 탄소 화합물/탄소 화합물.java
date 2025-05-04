import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    // 입력 : M1 + M2 = M3 => M1 * X1 + M2 * X2 = M3 * X3
    // 출력 : C + CC = CCCCC => C + 2 * 2C = CCCCC => 1 2 1
    // 방식 : +,=를 기준으로 나누기 -> CHO 개수 파싱 (예: {C=1, H=1, O=1} {H=2, O=1} {C=1, H=3, O=2}) -> X1-3 (C 키가 있으면 값 1 반환시키고 for문 돌면서 모든 조합 시도 ) 찾기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String equation = br.readLine();

        String[] parts = equation.split("[+=]");
        String M1 = parts[0];
        String M2 = parts[1];
        String M3 = parts[2];

        List<HashMap<String, Integer>> atomList = parse(M1, M2, M3);
        String result = result(atomList);

        System.out.println(result);

    }

    public static List<HashMap<String, Integer>> parse(String M1, String M2, String M3) {
        List<HashMap<String, Integer>> atomList = new ArrayList<>();
        String[] array = new String[] { M1, M2, M3 };

        for (int i = 0; i < array.length; i++) {
            atomList.add(new HashMap<>());
        }

        for (int i = 0; i < 3; i++) {
            String M = array[i];
            HashMap<String, Integer> atom = atomList.get(i);

            for (int j = 0; j < M.length(); j++) {
                char c = M.charAt(j);

                if (c == 'C' || c == 'H' || c == 'O') {
                    String atomName = String.valueOf(c);
                    int count = 1;

                    if (j + 1 < M.length() && Character.isDigit(M.charAt(j + 1))) {
                        count = M.charAt(j + 1) - '0';
                        j++;
                    }

                    atom.put(atomName, atom.getOrDefault(atomName, 0) + count);
                }
            }

        }

        return atomList;
    }

    public static String result(List<HashMap<String, Integer>> atomList) {
        for (int X1 = 1; X1 <= 10; X1++) {
            for (int X2 = 1; X2 <= 10; X2++) {
                for (int X3 = 1; X3 <= 10; X3++) {
                    boolean ok = true;

                    for (String atom : new String[] { "C", "H", "O" }) {
                        int atom1 = atomList.get(0).getOrDefault(atom, 0) * X1;
                        int atom2 = atomList.get(1).getOrDefault(atom, 0) * X2;
                        int atom3 = atomList.get(2).getOrDefault(atom, 0) * X3;

                        if (atom1 + atom2 != atom3) {
                            ok = false;
                            break;
                        }
                    }

                    if (ok) {
                        return X1 + " " + X2 + " " + X3;
                    }
                }

            }

        }

        return "";
    }
}