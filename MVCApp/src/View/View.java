package View;

import java.util.List;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class View implements iGetView {

    public void printAllStudent(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
