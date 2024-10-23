import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int floor = Integer.parseInt(br.readLine());

        int[] floorArray = new int[floor+1];
        int[] maxFloorArray = new int[floor+1];

        for(int i = 1; i <= floor; i++) {
            floorArray[i] = Integer.parseInt(br.readLine());
        }

        if(floor == 1) {
            System.out.println(floorArray[1]);
            return;
        }

        if(floor == 2) {
            System.out.println(floorArray[1] + floorArray[2]);
            return;
        }

        if(floor == 3) {
            System.out.println(Math.max(floorArray[1] + floorArray[3], floorArray[2] + floorArray[3]));
            return;
        }

        maxFloorArray[1] = floorArray[1];
        maxFloorArray[2] = floorArray[1] + floorArray[2];
        maxFloorArray[3] = Math.max(floorArray[1] + floorArray[3], floorArray[2] + floorArray[3]);

        for(int i = 4; i <= floor; i++) {
            // 연속해서 3 계단을 오를 수 없다

            // 두 계단을 한번에 올라오느냐,
            // 세 계단 전에서 두 계단 밟고 한 계단 올라오느냐

            // maxFloorArray[i-2] : 두 계단 전에서,
            // + floorArray[i] : 두 계단을 한번에 올라와서, 현재 계단 밟음
            
            // maxFloorArray[i-3] : 세 계단 전에서,
            // floorArray[i-1] : 두 계단을 밟고 (연속해서 3계단 못 오르니 두 계단 밟은거임)
            // + floorArray[i] : 현재 계단 밟음 (1계단)
            maxFloorArray[i] = Math.max((maxFloorArray[i-2]),(maxFloorArray[i-3] + floorArray[i-1])) + floorArray[i];
        }

        System.out.println(maxFloorArray[floor]);
    }
}