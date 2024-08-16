import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        // 생성자가 2개 있는 숫자는 101 101 이렇게 출력 될 수 있으므로 중복 제거해야 함
        // 생성자가 있는 숫자를 구하고 없는 숫자를 출력
        Set<Integer> nonSelfNumber = new HashSet<>();

        // 생성자가 있는 숫자
        // 1은 2의 생성자 (2는 생성자가 있는 숫자)
        for(int i = 1; i <= 10000; i++) {
            int generedNumber = selfNumber(i);

            if (generedNumber <= 10000) {
                nonSelfNumber.add(generedNumber);
            }
        }

        // 생성자가 없는 숫자 => 셀프넘버
        // 1은 생성자가 없음 (i가 1일 때 2부터 만들어짐)
        for(int i = 1; i <= 10000; i++) {
            if(!nonSelfNumber.contains(i)) {
                System.out.println(i);
            }
        }

    }

    public static int selfNumber(int n) {
        int sum = n;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}