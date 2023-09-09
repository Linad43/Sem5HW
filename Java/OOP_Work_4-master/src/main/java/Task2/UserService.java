package Task2;

import org.example.Student;
import org.example.Teacher;

import java.util.List;

public interface UserService<T> {
    List<T> getAll();
    void create(String name,int score,int age);
    void create(String name, String objectToTeach, int rang);

}
