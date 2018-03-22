package Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Adwiti on 3/22/2018.
 */
public class SortingOfCollectionUsingLambda {

    public static void main(String[] args) {
        BasicSortWithLambda();
    }

    public static void BasicSortWithLambda() {
        Student s1 = new Student("arun", "23");
        Student s2 = new Student("adwiti", "3");
        Student s3 = new Student("pushpa", "13");

        List<Student> students = Arrays.asList(s1, s2, s3);
        System.out.println(students);

        students.sort((s4, s5) -> s4.getAge().compareTo(s5.getAge()));
        System.out.println(students);
    }


}


class Student {
    private String name;
    private String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


