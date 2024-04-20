import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] array = new int[9][9];

        for (int i = 0; i < 9; i++) {
            String[] colString = br.readLine().split(" ");
            for (int j = 0; j < colString.length; j++) {
                array[i][j] = Integer.parseInt(colString[j]);
            }
        }

        int[] maxArray = new int[9];
        int[][] index = new int[9][2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxArray[j]) {
                    maxArray[j] = array[i][j];
                    index[j][0] = i;
                    index[j][1] = j;
                }
            }
        }

        int[] sortArray = Arrays.copyOf(maxArray, maxArray.length);
        Arrays.sort(sortArray);

        for(int i = 0; i < maxArray.length; i++) {
            if(sortArray[sortArray.length -1] == maxArray[i]) {
                System.out.println(maxArray[i]);
                System.out.println((index[i][0]+1) + " " + (index[i][1]+1));
                break;
            }
        }
    }
}