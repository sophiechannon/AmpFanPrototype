import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals
import org.mockito.Mockito.*

class ThermometerStubTest {
    @Test
    fun testGetTempReturnsRandomNumber() {
        val thermometer: ThermometerStub = mock(ThermometerStub::class.java)
        `when`(thermometer.getTemp()).thenReturn(60)
        assertEquals("returns random temp", thermometer.getTemp(), 60)
    }
}