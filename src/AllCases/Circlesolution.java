

public class Circlesolution {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        circle1.print();
    }

    /*
     * [1] Write a Java program to create a class called "Circle" with a radius attribute. (Done)
     * [2] You can access and modify this attribute.                                       (Done)
     * [3] Calculate the area and circumference of the circle.                             (Done)
     */

    public static class Circle {
        private float radius;
        private final double π = 3.14159;

        public Circle(float radius) {
            this.radius = radius;
        }

        public void setRadius(float radius) {
            this.radius = radius;
        }

        public float getRadius() {
            return radius;
        }

        public double getArea() {
            return π * (radius * radius);
        }

        public double getArea(float radius) {
            return π * (radius * radius);
        }

        public double getCircumference() {
            return 2 * π * radius;
        }

        public double getCircumference(float radius) {
            return 2 * Math.PI * radius;
        }

        public void print() {
            System.out.println("===================================================");
            System.out.println("radius => " + getRadius());
            System.out.println("__________________________________________________");
            System.out.println("Calculate the area and circumference of the circle");
            System.out.println("Area => " + getArea());
            System.out.println("circumference => " + getCircumference());
            System.out.println("=======================================");
        }

    }
}
