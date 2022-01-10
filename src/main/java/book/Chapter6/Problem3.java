package book.Chapter6;

import java.util.*;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String firstLine = "4 5";//sc.nextLine();
        String firstLine = sc.nextLine();

        List<Student> studentList = new ArrayList<>();
        int N = Integer.parseInt(firstLine); // Array Height
        int lineCount = 0;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            studentList.add(new Student(line.split(" ")[0], Integer.parseInt(line.split(" ")[1])));
            if (++lineCount == N) break;
        }

        studentList.stream().sorted(Comparator.comparing(Student::getPoint)).forEach(student -> {
            System.out.print(student.getName() + " ");
        });

        Collections.sort(studentList);

        studentList.forEach(student -> {
            System.out.println(student.getName());

        });

    }


    private static class Student implements Comparable<Student> {

        private String name;
        private int point;

        public Student(String name, int point) {
            this.name = name;
            this.point = point;
        }

        @Override
        public int compareTo(Student o) {
            return o.point - this.point;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPoint() {
            return point;
        }

        public void setPoint(int point) {
            this.point = point;
        }
    }
}
