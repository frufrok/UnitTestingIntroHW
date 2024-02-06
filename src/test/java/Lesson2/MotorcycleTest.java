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
        assertEquals(this.moto.getNumWheels(), 2);
    }

    @Test
    @DisplayName("Moto test drive speed")
    void testDrive() {
        moto.testDrive();
        assertEquals(this.moto.getSpeed(), 75);
    }

    @Test
    @DisplayName("Moto can stop")
    void park() {
        moto.testDrive();
        moto.park();
        assertEquals(this.moto.getSpeed(), 0);
    }
}