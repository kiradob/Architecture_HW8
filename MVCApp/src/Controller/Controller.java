package Controller;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Model;
import Model.Domain.Student;
import View.View;

public class Controller {

    private iGetModel model;
    private iGetView view;

    private List<Student> students;

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> studs)
    {
        if(studs.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update()
    {
        //MVP
        students = model.getAllStudents();

        if(testData(students))
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }



        //MVC
       // view.printAllStudent(model.getAllStudents());

    }
    
}
