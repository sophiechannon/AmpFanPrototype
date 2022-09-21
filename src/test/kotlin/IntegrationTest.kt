//import org.junit.jupiter.api.Test
//import org.mockito.Mockito
//import kotlin.test.DefaultAsserter.assertEquals
//
//class IntegrationTest {
//    @Test
//    fun testFanCanBeTurnedOn() {
//        val thermometer: ThermometerStub = Mockito.mock(ThermometerStub::class.java)
//        val thermostat = Thermostat(thermometer)
//        Mockito.`when`(thermometer.getTemp()).thenReturn(60)
//        main()
//        assertEquals("fan turns on at 60", thermostat.fanStatus, true)
//        assertEquals("LED turns on at 60", thermostat.amberLedStatus, true)
//    }
//}