import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static class Student {
        public String name;
        public int korean;
        public int english;
        public int math;

        Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Student[] array = new Student[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            Student student = new Student(name, korean, english, math);

            array[i] = student;
        }

        Arrays.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.korean != o2.korean) return o2.korean - o1.korean;
                if(o1.english != o2.english) return o1.english - o2.english;
                if(o1.math != o2.math) return o2.math - o1.math;
                
                return o1.name.compareTo(o2.name);
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < array.length; i++) {
            sb.append(array[i].name).append("\n");
        }

        System.out.println(sb);

    }
}