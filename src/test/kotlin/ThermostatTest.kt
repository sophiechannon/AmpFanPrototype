import org.junit.jupiter.api.Test
import org.mockito.Mockito
import kotlin.test.DefaultAsserter.assertEquals
import org.mockito.Mockito.*

internal class ThermostatTest {

    @Test
    fun testFanStatusIsFalseOnInitialisation() {
        val thermometer: ThermometerStub = Mockito.mock(ThermometerStub::class.java)
        val thermostat = Thermostat(thermometer)
        assertEquals("fanStatus is false initially", thermostat.fanStatus, false)
    }
    @Test
    fun testFanCanBeTurnedOn() {
        val thermometer: ThermometerStub = Mockito.mock(ThermometerStub::class.java)
        val thermostat = Thermostat(thermometer)
        thermostat.toggleFanStatus()
        assertEquals("fanStatus can be set to true", thermostat.fanStatus, true)
    }
    @Test
    fun testFanCanBeToggledOnAndOff() {
        val thermometer: ThermometerStub = Mockito.mock(ThermometerStub::class.java)
        val thermostat = Thermostat(thermometer)
        thermostat.toggleFanStatus()
        thermostat.toggleFanStatus()
        assertEquals("fanStatus can be set to true", thermostat.fanStatus, false)
    }
    @Test
    fun testReadTemperatureCanReturnsTemperature() {
        val thermometer: ThermometerStub = mock(ThermometerStub::class.java)
        val thermostat = Thermostat(thermometer)
        `when`(thermometer.getTemp()).thenReturn(60)
        assertEquals("Returns amp temperature", thermostat.readTemperature(), 60)
    }
    @Test
    fun testAmberLEDTurnsOnWithFan() {
        val thermometer: ThermometerStub = mock(ThermometerStub::class.java)
        val thermostat = Thermostat(thermometer)
        thermostat.toggleFanStatus()
        assertEquals("Turns on amber LED", thermostat.amberLedStatus, true)
    }
    fun testGreenLEDTurnsOffWithFan() {
        val thermometer: ThermometerStub = mock(ThermometerStub::class.java)
        val thermostat = Thermostat(thermometer)
        thermostat.toggleFanStatus()
        assertEquals("Turns on amber LED", thermostat.greenLedStatus, false)
    }

}