import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");
            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);
            
            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }
        
        int width = maxX - minX;
        int height = maxY - minY;
        int area = width * height;
        
        System.out.println(area);
    }
}