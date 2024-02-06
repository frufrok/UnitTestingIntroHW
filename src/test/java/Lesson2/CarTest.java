package Lesson2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        this.car = new Car("someCompany", "someModel", 2000);
    }

    @Test
    @DisplayName("Car is Vehicle")
    void carIsInstanceOfVehicle() {
        assertInstanceOf(Vehicle.class, this.car);
    }

    @Test
    @DisplayName("Car has 4 wheels")
    void carHasFourWheels() {
        assertEquals(this.car.getNumWheels(), 4);
    }

    @Test
    @DisplayName("Car test drive speed")
    void testDrive() {
        car.testDrive();
        assertEquals(this.car.getSpeed(), 60);
    }

    @Test
    @DisplayName("Car can stop")
    void park() {
        car.testDrive();
        car.park();
        assertEquals(this.car.getSpeed(), 0);
    }
}