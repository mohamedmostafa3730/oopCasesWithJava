

public class TrafficLightSolution {
    public static void main(String[] args) {
        System.out.println("33");
    }

    /*
     * [1] Write a Java program to create class called "TrafficLight" with
     * attributes for color and duration,
     * [2] and methods to change the color and check for red or green.
     */

    public static class TrafficLight {
        private String color;
        private int duration;

        public TrafficLight(String color, int duration) {
            this.color = color;
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void changeColor(String color){
            this.color = color;
        }

        public boolean IsRed(){
            return color.equals("red");
        }

        public boolean IsGreen(){
            return color.equals("Green");
        }

        public boolean IsYellow(){
            return color.equals("Yellow");
        }

    }
}
