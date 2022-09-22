import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class ThermometerStubTest {
    @Test
    fun testGetTempDecreasesTempOverSeventy() {
        val thermometer = ThermometerStub()
        thermometer.currentTemp = 70
        assertEquals("decreases temp over 70", thermometer.getTemp(), 69)
        assertEquals("up is now false", thermometer.up, false)
    }
    @Test
    fun testGetTempIncreasesUnderThirty() {
        val thermometer = ThermometerStub()
        thermometer.currentTemp = 30
        assertEquals("decreases temp over 30", thermometer.getTemp(), 31)
        assertEquals("up is now false", thermometer.up, true)
    }
    @Test
    fun testGetTempWorksForRandomNumber() {
        val thermometer = ThermometerStub()
        thermometer.currentTemp = 56
        assertEquals("works for random number", thermometer.getTemp(), 57)
    }
}