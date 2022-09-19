import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

internal class ThermostatTest {
    @Test
    fun testFanStatusIsFalseOnInitialisation() {
        val thermostat = Thermostat()
        assertEquals("fanStaus is false initially", thermostat.fanStatus, false)
    }
    @Test
    fun testFanCanBeTurnedOn() {
        val thermostat = Thermostat()
        thermostat.toggleFanStatus()
        assertEquals("fanStatus can be set to true", thermostat.fanStatus, true)
    }
    @Test
    fun testFanCanBeToggledOnAndOff() {
        val thermostat = Thermostat()
        thermostat.toggleFanStatus()
        thermostat.toggleFanStatus()
        assertEquals("fanStatus can be set to true", thermostat.fanStatus, false)
    }
}