package Day8;

import java.util.List;

public class StudentCollection {
    public static void main(String[] args) {
        List<Student> student= List.of(new Student(101,"anna"),
                                      new Student(102,"ema"),
                                      new Student(103,"iris"));

        System.out.println(student);
    }
}
