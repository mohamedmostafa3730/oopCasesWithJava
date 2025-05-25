package AllCases;

import java.time.LocalTime;

public class AirplaneSolution {

    public class Flight {
        private int flightNumber;
        private String destination;
        private LocalTime departureTime;
        private int delayTime;

        public Flight(int flightNumber, String destination, LocalTime departureTime) {
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.departureTime = departureTime;
            this.delayTime = 0;
        }

        // Getters and setters
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
    }

    // Interface for status reporting (OCP: Extensible reporting)
    interface StatusReporter {
        void reportStatus(Flight flight);
    }

    // Console-based status reporter
    class ConsoleStatusReporter implements StatusReporter {
        @Override
        public void reportStatus(Flight flight) {
            if (flight.getDelayTime() == 0) {
                System.out.println("Flight " + flight.getFlightNumber() + " is on time.");
            } else {
                System.out.println("Flight " + flight.getFlightNumber() + " is delayed by " +
                        flight.getDelayTime() + " minutes.");
            }
        }
    }

    // Interface for delay strategy (OCP: Extensible delay logic)
    interface DelayStrategy {
        void applyDelay(Flight flight, int minutes);
    }

    // Default delay strategy
    class DefaultDelayStrategy implements DelayStrategy {
        @Override
        public void applyDelay(Flight flight, int minutes) {
            flight.setDelayTime(minutes);
            flight.setDepartureTime(flight.getDepartureTime().plusMinutes(minutes));
        }
    }

    // Scheduler to handle delay logic (SRP: Manage scheduling)
    class FlightScheduler {
        private DelayStrategy delayStrategy;

        public FlightScheduler(DelayStrategy delayStrategy) {
            this.delayStrategy = delayStrategy;
        }

        public void delay(Flight flight, int minutes) {
            delayStrategy.applyDelay(flight, minutes);
        }
    }
}