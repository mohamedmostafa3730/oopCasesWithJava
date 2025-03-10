

public class RectangleSolution {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(5, 10);
        rec1.print();
        rec1.setWidth(10);
        rec1.print();
        rec1.setHeight(20);
        rec1.print();
    }

    /*
     * [1] Write a Java program to create a (Done)
     * [2] with width and height attributes. (Done)
     * [3] Calculate the area and perimeter of the rectangle. (Done)
     */

    public static class Rectangle {
        private float width;
        private float height;

        public Rectangle(float width, float height) {
            this.width = width;
            this.height = height;
        }

        public float getWidth() {
            return width;
        }

        public float getHeight() {
            return height;
        }

        public void setWidth(float width) {
            this.width = width;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        public float getArea() {
            return width * height;
        }

        public float getArea(float width, float height) {
            return width * height;
        }

        public float getPerimeter() {
            return 2 * (width + height);
        }

        public float getPerimeter(float width, float height) {
            return 2 * (width + height);
        }

        public void print() {
            System.out.println("==================================");
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: " + getPerimeter());
            System.out.println("==================================");
        }

    }
}