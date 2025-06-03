package SchoolManagementSystem.supClasses;

import SchoolManagementSystem.Interfaces.addCourse;
import SchoolManagementSystem.superClasses.Person;
import SchoolManagementSystem.superClasses.course;
import java.util.ArrayList;

public class Student extends Person implements addCourse{
    private ArrayList<course> enrolled_subjects;

    public Student(String name, int id, String role) {
        super(name, id, role);
        enrolled_subjects = new ArrayList<>();
    }

    @Override
    public void add(course subject) {
        enrolled_subjects.add(subject);
    }

    public ArrayList<course> getEnrolled_subjects() {
        return enrolled_subjects;
    }
    
}
