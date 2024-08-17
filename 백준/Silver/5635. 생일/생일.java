import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Person {
    String name;
    int day, month, year;

    Person(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 모든 경우의 수에서 계속해서 더 어리거나 더 나이가 많으면 가장 어리거나 나이가 많은 사람
        Person younger = null;
        Person older = null;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            Person person = new Person(name, day, month, year);

            younger = whoIsYounger(younger, person);

            older = whoIsOlder(older, person);
        }

        StringBuilder sb = new StringBuilder();

        sb.append(younger.name).append("\n").append(older.name);

        System.out.println(sb);
    }

    public static Person whoIsYounger(Person younger, Person person) {
        if (younger != null) {
            if (younger.year > person.year ||
                (younger.year == person.year && younger.month > person.month) ||
                (younger.year == person.year && younger.month == person.month && younger.day > person.day)) {
                return younger;
            } else {
                return person;
            }
        } else {
            return person;
        }
    }

    public static Person whoIsOlder(Person older, Person person) {
        if (older != null) {
            if (older.year < person.year ||
                (older.year == person.year && older.month < person.month) ||
                (older.year == person.year && older.month == person.month && older.day < person.day)) {
                return older;
            } else {
                return person;
            }
        } else {
            return person;
        }
    }
}