

import java.time.LocalDate;
import java.time.Period;

public class Employee2Solution {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mohamed", 2000, LocalDate.parse("2021-04-01"));
        Employee e2 = new Employee("Ahmed", 5000, LocalDate.parse("2020-01-01"));
        e1.getInfo();
        System.out.println("==========================================");
        e2.getInfo();
    }

    /*
     * Write a Java program to create a class called "Employee" with a name, salary,
     * and hire date attributes,
     * and a method to calculate years of service.
     */

    public static class Employee {
        private String name;
        private double salary;
        private LocalDate hireDte;

        public Employee(String name, double salary, LocalDate hireDte) {
            this.name = name;
            this.salary = salary;
            this.hireDte = hireDte;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public LocalDate getHireDte() {
            return hireDte;
        }

        public void setHireDte(LocalDate hireDte) {
            this.hireDte = hireDte;
        }

        public int getYearsOfService() {
            return Period.between(hireDte, LocalDate.now()).getYears();
        }

        public void getInfo() {
            System.out.println("|==================================|");
            System.out.println("| Your name is: " + this.name + "              |");
            System.out.println("| Your salary is: " + this.salary + "           |");
            System.out.println("| Your hireDte is: " + this.hireDte + "      |");
            System.out.println("| Years Of Service is / are: " + this.getYearsOfService() + "     |");
            System.out.println("|==================================|");
        }
    }
}
