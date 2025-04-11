package AllCases;


public class EmployeeSolution {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mohamed", "sales", 5000);
        Employee e2 = new Employee("ahmed", "programer", 10000);
        e1.print();
        System.out.println("---");
        e2.print();
        System.out.println("===");
        e1.increaseSalary(0.5);
        e2.increaseSalary(0.2);
        System.out.println("===");
        e1.print();
        System.out.println("---");
        e2.print();
    }
    /*
     * [1] Write a Java program to create a class called "Employee" (Done)
     * [2] with a name, job title, and salary attributes, (Done)
     * [3] and methods to calculate and update salary. (Done)
     * 
     */

    public static class Employee {
        private String name, jopTitle;
        private double salary;

        public Employee(String name, String jopTitle, int salary) {
            this.name = name;
            this.jopTitle = jopTitle;
            this.salary = salary;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setJopTitle(String jopTitle) {
            this.jopTitle = jopTitle;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getName() {
            return this.name;
        }

        public String getJopTitle() {
            return this.jopTitle;
        }

        public double getSalary() {
            return this.salary;
        }

        public void increaseSalary(double percentage) {
            salary = salary + salary * percentage;
        }

        public void print() {
            System.out.println("Name: " + name);
            System.out.println("jop Title: " + jopTitle);
            System.out.println("Salary: " + salary);
        }

    }

}
