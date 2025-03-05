package case10;

import java.util.ArrayList;

public class case10 {
    public static void main(String[] args) {
        Student s1 = new Student("Mohamed");
        s1.addCourses("English");
        s1.addCourses("Arabic");
        s1.addCourses("Programming");
        s1.printStudentDetails();
    }

    // Write a Java program to create a class called "Student" with a name, grade,
    // and courses attributes,
    // and methods to add and remove courses.

    public static class Student {
        private String name;
        private int grade;
        private ArrayList<String> courses;

        public Student(String name) {
            this.name = name;
            courses = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void addCourses(String Course) {
            courses.add(Course);
        }

        public void removeCourses(String Course) {
            courses.remove(Course);
        }

        public ArrayList getAllCourses() {
            return courses;
        }

        public void printStudentDetails() {
            System.out.println("|========================================|");
            System.out.println("| your name is: " + this.name + " |");
            System.out.println("| your name is: " + this.getAllCourses() + " |");
            System.out.println("| your name is: " + this.grade + " |");
            System.out.println("|========================================|");
        }

    }
}
