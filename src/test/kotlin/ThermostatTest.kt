import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import kotlin.test.DefaultAsserter.assertEquals
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

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

}