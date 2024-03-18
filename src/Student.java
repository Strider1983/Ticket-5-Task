import java.util.Objects;

public class Student {
    private String name;
    private int age;


    @Override
    public boolean equals (Object o)  {
        if (this == o) return true;
        if (o == null && getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return (name.equals(student.name) && age == student.age);
    }

    @Override
    public int hashCode () {
        int result = 1;
        result = result * 31 + age + (name == null ? 0: name.hashCode());
        return result;
    }
    @Override
    public int hashCode () {
        return Objects.hash(name, age);
    }
}
