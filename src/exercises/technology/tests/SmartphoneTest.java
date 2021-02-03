package exercises.technology.tests;

import exercises.technology.main.Laptop;
import exercises.technology.main.Smartphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartphoneTest {

    Smartphone mySmartPhone;

    @Before
    public void beforeTests() {
        mySmartPhone = new Smartphone(3000, 5000, "2021", true);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(3000, this.mySmartPhone.getScreenWidth());
        assertEquals(5000, this.mySmartPhone.getScreenHeight());
        assertEquals("2021", this.mySmartPhone.getManufactureYear());
        assertEquals(true, this.mySmartPhone.getIsConnectedTo5G());
    }
}