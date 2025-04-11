package AllCases;


public class PersonSolution {

    public static void main(String[] args) {

        Person person1 = new Person("Ean Craig", 11);
        Person person2 = new Person("Evan Ross", 12);
        person1.print(person2);

    }

    /*
     * [1] Write a Java program to create a class called "Person" with a name and age attribute. (Done)
     * [2] Create two instances of the "Person" class,                                           (Done)
     * [3] set their attributes using the constructor,                                           (Done)
     * [4] and print their name and age.                                                         (Done)
     */
    public static class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void print(Person copy) {
            System.out.println("============================================");
            System.out.println("=== Your name is " + copy.getName() + " ======");
            System.out.println("=== Your age is " + copy.getAge() + " ========");
            System.out.println("============================================");
        }
    }
}
