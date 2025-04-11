package AllCases;

import java.time.LocalTime;

public class AirplaneSolution {

    public static class Airplane {
        private int flightNumber;
        private String destination;
        private LocalTime departureTime;
        private int delayTime;

        public Airplane(int flightNumber, String destination, LocalTime departureTime, int delayTime) {
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.departureTime = departureTime;
            this.delayTime = 0;
        }

        public int getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(int flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public LocalTime getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(LocalTime departureTime) {
            this.departureTime = departureTime;
        }

        public int getDelayTime() {
            return delayTime;
        }

        public void setDelayTime(int delayTime) {
            this.delayTime = delayTime;
        }

        public void delay(int minute) {
            this.delayTime = minute;
            this.departureTime = this.departureTime.plusMinutes(minute);
        }

        public void checkStatus() {
            if (delayTime == 0)
                System.out.println("Flight " + flightNumber + " is on time.");
            else
                System.out.println("Flight " + flightNumber + " is delayed by " + delayTime + " minutes.");

        }

    }
}