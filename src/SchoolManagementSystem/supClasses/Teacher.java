package SchoolManagementSystem.supClasses;

import SchoolManagementSystem.Interfaces.addCourse;
import SchoolManagementSystem.superClasses.Person;
import SchoolManagementSystem.superClasses.course;
import java.util.ArrayList;

public class Teacher extends Person implements addCourse{
    ArrayList<course> subjects_taught ;

    public Teacher(String name, int id, String role) {
        super(name, id,role);
        subjects_taught = new ArrayList<>();
    }

    public ArrayList<course> getSubjects_taught() {
        return subjects_taught;
    }

    @Override
    public void add(course subject) {
        subjects_taught.add(subject);
    }
    
}
