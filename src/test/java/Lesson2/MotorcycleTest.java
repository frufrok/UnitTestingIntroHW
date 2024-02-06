package Lesson2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    private Motorcycle moto;

    @BeforeEach
    void setUp() {
        this.moto = new Motorcycle("someCompany", "someModel", 2000);
    }

    @Test
    @DisplayName("Moto is Vehicle")
    void motoIsInstanceOfVehicle() {
        assertInstanceOf(Vehicle.class, this.moto);
    }

    @Test
    @DisplayName("Moto has 2 wheels")
    void motoHasFourWheels() {
        assertEquals(2, this.moto.getNumWheels());
    }

    @Test
    @DisplayName("Moto test drive speed")
    void testDrive() {
        moto.testDrive();
        assertEquals(75, this.moto.getSpeed());
    }

    @Test
    @DisplayName("Moto can stop")
    void park() {
        moto.testDrive();
        moto.park();
        assertEquals(0, this.moto.getSpeed());
    }
}