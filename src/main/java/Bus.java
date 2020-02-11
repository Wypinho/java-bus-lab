import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengeCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busStop) {

        while(busStop.queueCount() > 0 && this.passengeCount() < this.capacity){
            Person passenger = busStop.removePerson();
            this.addPassenger(passenger);
        }

    }
}
