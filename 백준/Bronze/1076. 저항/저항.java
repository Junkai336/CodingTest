import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        입력
            색깔 3개 줄바꿈

        출력
            (문자열 저항값 + 문자열 저항값) * 숫자 곱

        방식
            1. 색,값,곲은 정해져 있으니까 객체로 만들어서 하드코딩함
            2. 더하고 곱함

        설명
            

     */

    public static class Color {
        String name;
        String value;
        long multiply;

        Color(String name, String value, int multiply) {
            this.name = name;
            this.value = value;
            this.multiply = multiply;
        }
    }

    static Color black = new Color("black", "0", 1);
    static Color brown = new Color("brown", "1", 10);
    static Color red = new Color("red", "2", 100);
    static Color orange = new Color("orange", "3", 1000);
    static Color yellow = new Color("yellow", "4", 10000);
    static Color green = new Color("green", "5", 100000);
    static Color blue = new Color("blue", "6", 1000000);
    static Color violet = new Color("violet", "7", 10000000);
    static Color grey = new Color("grey", "8", 100000000);
    static Color white = new Color("white", "9", 1000000000);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstColor = br.readLine();
        String secondColor = br.readLine();
        String thirdColor = br.readLine();

        String firstColorValue = valueSearch(firstColor);
        String secondColorValue = valueSearch(secondColor);
        long thirdColorMultiply = multiplySearch(thirdColor);

        long result = Long.parseLong(firstColorValue + secondColorValue) * thirdColorMultiply;
        
        System.out.println(result);
    }

    public static String valueSearch(String color) {
        switch (color) {
            case "black": return black.value;
            case "brown": return brown.value;
            case "red": return red.value;
            case "orange": return orange.value;
            case "yellow": return yellow.value;
            case "green": return green.value;
            case "blue": return blue.value;
            case "violet": return violet.value;
            case "grey": return grey.value;
            case "white": return white.value;
            default: return "";
        }
    }

        public static long multiplySearch(String color) {
        switch (color) {
            case "black": return black.multiply;
            case "brown": return brown.multiply;
            case "red": return red.multiply;
            case "orange": return orange.multiply;
            case "yellow": return yellow.multiply;
            case "green": return green.multiply;
            case "blue": return blue.multiply;
            case "violet": return violet.multiply;
            case "grey": return grey.multiply;
            case "white": return white.multiply;
            default: return 0;
        }
    }
}