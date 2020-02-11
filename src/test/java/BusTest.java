import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Falkirk", 4);
        person = new Person();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengeCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengeCount());
    }

    @Test
    public void cantExceedCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(4, bus.passengeCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.passengeCount());
    }

}
