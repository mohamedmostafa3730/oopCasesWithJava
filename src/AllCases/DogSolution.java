
public class DogSolution {

    public static void main(String[] args) {
        Dog dog1 = new Dog("tet", "null");
        dog1.Print();
        dog1.setName("rara");
        dog1.setBreed("poodle");
    }

    /*
     * [1] Write a Java program to create a class called "Dog" with a name and breed attribute. (Done)
     * [2] Create two instances of the "Dog" class,                                             (Done)
     * [3] set their attributes using the constructor and modify the attributes,                (Done)
     * [4] using the setter methods and print the updated values.                               (Done)
     */
    public static class Dog {

        private String name;
        private String breed;

        public Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        public void setName(String name) {
            this.name = name;
            Print();
        }

        public void setBreed(String breed) {
            this.breed = breed;
            Print();
        }

        public String getName() {
            return name;
        }

        public String getBreed() {
            return breed;
        }

        public void Print() {
            System.out.println("============================================");
            System.out.println("=== Your name is " + getName() + " ======");
            System.out.println("=== Your breed is " + getBreed() + " ========");
            System.out.println("============================================");
        }
    }

}
