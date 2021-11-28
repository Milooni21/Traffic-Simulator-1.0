import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ScooterTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Scooter scooter = new Scooter("0");

    @Test
    void getLength() {
        assertEquals(0.75, scooter.getLength());
    }

    @Test
    void getId() {
        assertEquals("scooter_0", scooter.getId());
    }

    @Test
    void testInheritance() {
        assertEquals(0, scooter.getSpeed());
        assertEquals(1, scooter.getPosition());
    }
}
