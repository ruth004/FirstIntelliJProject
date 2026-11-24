import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner airConditioner;

    @BeforeEach
    public void setAirConditioner() {
        airConditioner = new AirConditioner();
        airConditioner.setName("Themercool");
        airConditioner.setModel("1727");
        airConditioner.setSize(24);
        airConditioner.setWeight(20.323423232F);
    }

    @Test
    public void testThatAcIsOff() {
        assertFalse(airConditioner.getState());
    }

    @Test
    public void testThatAcIsOff_AcGotTurnedOn() {
        airConditioner.setState(true);
        assertTrue(airConditioner.getState());
    }

    @Test
    public void testThatAcIsOff_AcGotTurnedOn_AcDefaultValueIs30() {
        airConditioner.setState(true);
        assertTrue(airConditioner.getState());

        assertEquals(30, airConditioner.getTemperature());
    }


    @Test
    public void testThatAcIsOff_AcGotTurnedOn_AcTemperatureIsIncreased() {
        airConditioner.setState(true);
        assertTrue(airConditioner.getState());

        assertEquals(30, airConditioner.getTemperature());

        airConditioner.increaseTemperature();
        assertEquals(29, airConditioner.getTemperature());
    }

    @Test
    public void testThatAcIsOff_AcGotTurnedOn_AcTemperatureIsIncreasedWhileAcTemperatureWas16() {
        airConditioner.setState(true);
        assertTrue(airConditioner.getState());

        assertEquals(30, airConditioner.getTemperature());

        airConditioner.setTemperature(16);

        airConditioner.increaseTemperature();
        assertEquals(16, airConditioner.getTemperature());

    }
    @Test
    public void testThatAcIsOff_AcGotTurnedOn_AcTemperatureIsDecreaseWhileAcTemperatureWas16 () {
        airConditioner.setState(true);
        assertTrue(airConditioner.getState());

        assertEquals(30, airConditioner.getTemperature());

        airConditioner.setTemperature(16);
        airConditioner.decreaseTemperature();
        assertEquals(17, airConditioner.getTemperature());

    }

    @Test
    public void testThatAcIsOff_AcGotTurnedOn_AcTemperatureIsDecrease() {
        airConditioner.setState(true);
        assertTrue(airConditioner.getState());

        assertEquals(30, airConditioner.getTemperature());

        airConditioner.decreaseTemperature();
        assertEquals(30, airConditioner.getTemperature());
    }

}

